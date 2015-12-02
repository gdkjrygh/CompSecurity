.class public Lcom/facebook/base/e;
.super Ljava/lang/Object;
.source "NormalizerWrapper.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    return-void
.end method

.method public static a(Ljava/lang/CharSequence;Lcom/facebook/base/g;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 37
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-ge v0, v1, :cond_0

    .line 38
    invoke-static {p0, p1}, Lcom/facebook/base/e;->b(Ljava/lang/CharSequence;Lcom/facebook/base/g;)Ljava/lang/String;

    move-result-object v0

    .line 40
    :goto_0
    return-object v0

    :cond_0
    invoke-static {p0, p1}, Lcom/facebook/base/e;->c(Ljava/lang/CharSequence;Lcom/facebook/base/g;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private static b(Ljava/lang/CharSequence;Lcom/facebook/base/g;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static c(Ljava/lang/CharSequence;Lcom/facebook/base/g;)Ljava/lang/String;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 51
    invoke-static {p1}, Lcom/facebook/base/g;->unwrap(Lcom/facebook/base/g;)Ljava/text/Normalizer$Form;

    move-result-object v0

    invoke-static {p0, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
