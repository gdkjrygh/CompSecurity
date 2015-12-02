.class Lcom/facebook/common/e/l;
.super Ljava/lang/Object;
.source "FbErrorReporterImpl.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Lorg/acra/ErrorReporter;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/e/j;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/facebook/common/e/l;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lorg/acra/ErrorReporter;
    .locals 1

    .prologue
    .line 33
    invoke-static {}, Lorg/acra/ErrorReporter;->getInstance()Lorg/acra/ErrorReporter;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 29
    invoke-virtual {p0}, Lcom/facebook/common/e/l;->a()Lorg/acra/ErrorReporter;

    move-result-object v0

    return-object v0
.end method
