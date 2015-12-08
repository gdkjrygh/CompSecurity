.class public final Lcom/android/volley/a;
.super Lcom/android/volley/w;
.source "SourceFile"


# instance fields
.field private b:Landroid/content/Intent;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/android/volley/w;-><init>()V

    .line 32
    return-void
.end method

.method public constructor <init>(Lcom/android/volley/k;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p1}, Lcom/android/volley/w;-><init>(Lcom/android/volley/k;)V

    .line 42
    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/android/volley/a;->b:Landroid/content/Intent;

    if-eqz v0, :cond_0

    .line 63
    const-string v0, "User needs to (re)enter credentials."

    .line 65
    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0}, Lcom/android/volley/w;->getMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
