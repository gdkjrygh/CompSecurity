.class public Lkik/a/f/e/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/f/e/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkik/a/f/n;)Lkik/a/d/a/g;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 19
    const-string v1, "scan-notification"

    invoke-virtual {p1, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 20
    const-string v1, "nonce"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 21
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 30
    :goto_0
    new-instance v1, Lkik/a/d/a/k;

    invoke-direct {v1, v0}, Lkik/a/d/a/k;-><init>(I)V

    move-object v0, v1

    .line 33
    :cond_0
    return-object v0

    .line 27
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method
