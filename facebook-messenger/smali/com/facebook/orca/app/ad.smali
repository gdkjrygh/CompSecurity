.class Lcom/facebook/orca/app/ad;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/messages/threads/ui/name/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1118
    iput-object p1, p0, Lcom/facebook/orca/app/ad;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1118
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/ad;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/messages/threads/ui/name/e;
    .locals 4

    .prologue
    .line 1123
    new-instance v2, Lcom/facebook/messages/threads/ui/name/e;

    const-class v0, Landroid/content/res/Resources;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/ad;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/res/Resources;

    const-class v1, Lcom/facebook/messages/threads/ui/name/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/ad;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/messages/threads/ui/name/a;

    sget-object v3, Lcom/facebook/messages/threads/ui/name/d;->USE_THREAD_NAME_IF_AVAILABLE:Lcom/facebook/messages/threads/ui/name/d;

    invoke-direct {v2, v0, v1, v3}, Lcom/facebook/messages/threads/ui/name/e;-><init>(Landroid/content/res/Resources;Lcom/facebook/messages/threads/ui/name/a;Lcom/facebook/messages/threads/ui/name/d;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1118
    invoke-virtual {p0}, Lcom/facebook/orca/app/ad;->a()Lcom/facebook/messages/threads/ui/name/e;

    move-result-object v0

    return-object v0
.end method
