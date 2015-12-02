.class public Lcom/android/volley/AuthFailureError;
.super Lcom/android/volley/VolleyError;
.source "360Security"


# instance fields
.field private a:Landroid/content/Intent;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/android/volley/VolleyError;-><init>()V

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/android/volley/VolleyError;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/android/volley/AuthFailureError;->a:Landroid/content/Intent;

    .line 34
    return-void
.end method

.method public constructor <init>(Lcom/android/volley/i;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0, p1}, Lcom/android/volley/VolleyError;-><init>(Lcom/android/volley/i;)V

    .line 38
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p1}, Lcom/android/volley/VolleyError;-><init>(Ljava/lang/String;)V

    .line 42
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1, p2}, Lcom/android/volley/VolleyError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/android/volley/AuthFailureError;->a:Landroid/content/Intent;

    if-eqz v0, :cond_0

    .line 55
    const-string/jumbo v0, "User needs to (re)enter credentials."

    .line 57
    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0}, Lcom/android/volley/VolleyError;->getMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getResolutionIntent()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/android/volley/AuthFailureError;->a:Landroid/content/Intent;

    return-object v0
.end method
