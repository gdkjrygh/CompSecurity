.class Lcom/facebook/orca/app/cb;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/photos/c/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 2093
    iput-object p1, p0, Lcom/facebook/orca/app/cb;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 2093
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/cb;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/photos/c/a;
    .locals 3

    .prologue
    .line 2097
    invoke-static {}, Lcom/facebook/orca/photos/c/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2098
    new-instance v2, Lcom/facebook/orca/photos/c/a;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/cb;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Landroid/app/DownloadManager;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/cb;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/DownloadManager;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/photos/c/a;-><init>(Landroid/content/Context;Landroid/app/DownloadManager;)V

    move-object v0, v2

    .line 2102
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 2092
    invoke-virtual {p0}, Lcom/facebook/orca/app/cb;->a()Lcom/facebook/orca/photos/c/a;

    move-result-object v0

    return-object v0
.end method
