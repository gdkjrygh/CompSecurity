.class public Lcom/facebook/orca/chatheads/cn;
.super Lcom/facebook/inject/c;
.source "ChatHeadsModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 250
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 55
    new-instance v0, Lcom/facebook/b/a/g;

    invoke-direct {v0}, Lcom/facebook/b/a/g;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cn;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 56
    new-instance v0, Lcom/facebook/n/a/a;

    invoke-direct {v0}, Lcom/facebook/n/a/a;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cn;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 58
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cn;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/chatheads/annotations/IsChatHeadsEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/chatheads/dx;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 61
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cn;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/chatheads/annotations/IsChatHeadsPermitted;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/chatheads/dy;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 64
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cn;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/chatheads/annotations/IsHeadCaseEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 67
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cn;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/chatheads/annotations/IsHeadCasePermitted;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 72
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cn;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/chatheads/annotations/IsChatHeadsMultiProcessEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 77
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cn;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/push/annotations/IsDeviceForegroundEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/chatheads/dz;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 81
    const-class v0, Lcom/facebook/orca/chatheads/al;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cn;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/ct;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/chatheads/ct;-><init>(Lcom/facebook/orca/chatheads/cn;Lcom/facebook/orca/chatheads/co;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 83
    const-class v0, Lcom/facebook/orca/chatheads/ae;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cn;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/cs;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/chatheads/cs;-><init>(Lcom/facebook/orca/chatheads/cn;Lcom/facebook/orca/chatheads/co;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 85
    const-class v0, Lcom/facebook/orca/chatheads/eb;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cn;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/cy;

    invoke-direct {v1, v2}, Lcom/facebook/orca/chatheads/cy;-><init>(Lcom/facebook/orca/chatheads/co;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 87
    const-class v0, Lcom/facebook/orca/chatheads/b/k;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cn;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/cr;

    invoke-direct {v1, v2}, Lcom/facebook/orca/chatheads/cr;-><init>(Lcom/facebook/orca/chatheads/co;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 90
    const-class v0, Lcom/facebook/orca/chatheads/b/f;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cn;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/cq;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/chatheads/cq;-><init>(Lcom/facebook/orca/chatheads/cn;Lcom/facebook/orca/chatheads/co;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 92
    const-class v0, Lcom/facebook/orca/f/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cn;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/cp;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/chatheads/cp;-><init>(Lcom/facebook/orca/chatheads/cn;Lcom/facebook/orca/chatheads/co;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 96
    const-class v0, Lcom/facebook/orca/chatheads/by;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cn;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/cu;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/chatheads/cu;-><init>(Lcom/facebook/orca/chatheads/cn;Lcom/facebook/orca/chatheads/co;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 99
    const-class v0, Lcom/facebook/orca/chatheads/ch;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cn;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/cw;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/chatheads/cw;-><init>(Lcom/facebook/orca/chatheads/cn;Lcom/facebook/orca/chatheads/co;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 103
    const-class v0, Lcom/facebook/orca/chatheads/cz;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cn;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/cx;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/chatheads/cx;-><init>(Lcom/facebook/orca/chatheads/cn;Lcom/facebook/orca/chatheads/co;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 106
    const-class v0, Lcom/facebook/orca/chatheads/bz;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cn;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/cv;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/chatheads/cv;-><init>(Lcom/facebook/orca/chatheads/cn;Lcom/facebook/orca/chatheads/co;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 109
    const-class v0, Lcom/facebook/n/j;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cn;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/chatheads/annotations/ForChatHeads;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/n/j;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 114
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsLowPriorityInitOnUiThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/chatheads/cn;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/chatheads/ch;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 116
    return-void
.end method

.method public a(Lcom/facebook/inject/t;)V
    .locals 3

    .prologue
    .line 120
    const-class v0, Lcom/facebook/fbservice/service/p;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/p;

    .line 121
    sget-object v1, Lcom/facebook/orca/chatheads/cz;->a:Lcom/facebook/common/process/c;

    const-class v2, Lcom/facebook/orca/chatheads/ChatHeadsBlueService;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/common/process/c;Ljava/lang/Class;)V

    .line 123
    return-void
.end method
