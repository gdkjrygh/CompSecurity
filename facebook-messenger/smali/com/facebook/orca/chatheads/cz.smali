.class public Lcom/facebook/orca/chatheads/cz;
.super Ljava/lang/Object;
.source "ChatHeadsMultiProcessManager.java"


# static fields
.field public static final a:Lcom/facebook/common/process/c;


# instance fields
.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 19
    const-string v0, "com.facebook.orca"

    const-string v1, "chatheads"

    invoke-static {v0, v1}, Lcom/facebook/common/process/c;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/common/process/c;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/chatheads/cz;->a:Lcom/facebook/common/process/c;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;)V
    .locals 0
    .param p1    # Ljavax/inject/a;
        .annotation runtime Lcom/facebook/orca/chatheads/annotations/IsChatHeadsMultiProcessEnabled;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/facebook/orca/chatheads/cz;->b:Ljavax/inject/a;

    .line 27
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cz;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 31
    const-class v0, Lcom/facebook/orca/chatheads/ChatHeadServiceMultiProcess;

    .line 33
    :goto_0
    return-object v0

    :cond_0
    const-class v0, Lcom/facebook/orca/chatheads/ChatHeadService;

    goto :goto_0
.end method

.method public a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cz;->a()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 39
    return-void

    .line 38
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
