.class Lcom/facebook/orca/app/cz;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/prefs/av;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1342
    iput-object p1, p0, Lcom/facebook/orca/app/cz;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1342
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/cz;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/prefs/av;
    .locals 7

    .prologue
    .line 1347
    new-instance v0, Lcom/facebook/orca/prefs/av;

    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/cz;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/d;

    const-class v2, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/cz;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/fbservice/ops/k;

    const-class v3, Lcom/facebook/orca/f/k;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/cz;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/f/k;

    const-class v4, Lcom/facebook/orca/threads/FolderName;

    const-class v5, Lcom/facebook/orca/annotations/CurrentFolder;

    invoke-virtual {p0, v4, v5}, Lcom/facebook/orca/app/cz;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v5, Landroid/os/Handler;

    const-class v6, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {p0, v5, v6}, Lcom/facebook/orca/app/cz;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/os/Handler;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/prefs/av;-><init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/fbservice/ops/k;Lcom/facebook/orca/f/k;Ljavax/inject/a;Landroid/os/Handler;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1342
    invoke-virtual {p0}, Lcom/facebook/orca/app/cz;->a()Lcom/facebook/orca/prefs/av;

    move-result-object v0

    return-object v0
.end method
