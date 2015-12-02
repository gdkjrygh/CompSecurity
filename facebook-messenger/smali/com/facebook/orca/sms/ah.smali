.class public Lcom/facebook/orca/sms/ah;
.super Lcom/facebook/inject/c;
.source "MmsSmsModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 67
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 492
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 71
    new-instance v0, Lcom/facebook/sms/a;

    invoke-direct {v0}, Lcom/facebook/sms/a;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 74
    const-class v0, Lcom/facebook/orca/push/sms/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/ba;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/ba;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 76
    const-class v0, Lcom/facebook/sms/a/a;

    const-class v1, Lcom/facebook/sms/annotation/HighPriHandler;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/push/sms/b;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 78
    const-class v0, Lcom/facebook/orca/push/sms/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/az;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/az;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 80
    const-class v0, Lcom/facebook/sms/a/a;

    const-class v1, Lcom/facebook/sms/annotation/LowPriHandler;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/push/sms/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 84
    const-class v0, Lcom/facebook/orca/sms/bj;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/aw;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/aw;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 86
    const-class v0, Lcom/facebook/orca/sms/aa;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/ar;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/ar;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 88
    const-class v0, Lcom/facebook/orca/sms/z;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/aq;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/aq;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 90
    const-class v0, Lcom/facebook/orca/sms/y;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/ap;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/ap;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 92
    const-class v0, Lcom/facebook/orca/sms/bk;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/ax;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/ax;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 94
    const-class v0, Lcom/facebook/orca/sms/bi;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/av;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/av;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 96
    const-class v0, Lcom/facebook/orca/sms/af;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/au;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/au;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 99
    const-class v0, Lcom/facebook/orca/sms/bo;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/bc;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/bc;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 103
    const-class v0, Lcom/facebook/orca/sms/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/aj;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/aj;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 107
    const-class v0, Lcom/facebook/orca/sms/r;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/al;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/al;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 109
    const-class v0, Lcom/facebook/orca/sms/u;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/an;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/an;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 112
    const-class v0, Lcom/facebook/orca/sms/t;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/am;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/am;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 115
    const-class v0, Lcom/facebook/orca/sms/bm;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/ay;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/ay;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 120
    const-class v0, Lcom/facebook/orca/sms/bn;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/bb;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/bb;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 122
    const-class v0, Lcom/facebook/orca/sms/br;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/bf;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/bf;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 125
    const-class v0, Lcom/facebook/orca/sms/bq;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/be;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/be;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 130
    const-class v0, Lcom/facebook/orca/sms/a/c;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/bd;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/bd;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 133
    const-class v0, Lcom/facebook/orca/sms/a/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/bg;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/bg;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 136
    const-class v0, Lcom/facebook/orca/sms/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/ak;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/ak;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 143
    const-class v0, Lcom/facebook/orca/sms/ac;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/at;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/at;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 146
    const-class v0, Lcom/facebook/backgroundtasks/c;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/sms/ac;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 150
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsClientSmsEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/sms/h;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 153
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsSmsNotifyEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/sms/n;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 156
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsClientSmsPossible;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/sms/i;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 159
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsCallLogEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/sms/g;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 162
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsSmsReadPermitted;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/sms/o;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 165
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsSmsReceivePermitted;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/sms/p;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 168
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsSmsSendPermitted;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/sms/q;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 171
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsMmsReadPermitted;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/sms/k;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 174
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsMmsReceivePermitted;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/sms/l;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 177
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsMmsSendPermitted;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/sms/m;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 181
    const-class v0, Lcom/facebook/orca/sms/ab;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/as;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/sms/as;-><init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 183
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/sms/ab;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 186
    const-class v0, Lcom/facebook/orca/sms/x;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/sms/ao;

    invoke-direct {v1, v2}, Lcom/facebook/orca/sms/ao;-><init>(Lcom/facebook/orca/sms/ai;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 188
    const-class v0, Lcom/facebook/auth/broadcast/c;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ah;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/sms/x;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 190
    return-void
.end method
