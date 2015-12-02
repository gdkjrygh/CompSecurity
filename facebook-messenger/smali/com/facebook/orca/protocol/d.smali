.class public Lcom/facebook/orca/protocol/d;
.super Lcom/facebook/inject/c;
.source "WebServiceModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 87
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 456
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 91
    new-instance v0, Lcom/facebook/f/j;

    invoke-direct {v0}, Lcom/facebook/f/j;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 92
    const-class v0, Lcom/facebook/nux/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 94
    const-class v0, Lcom/facebook/orca/protocol/methods/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/f;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/f;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 96
    const-class v0, Lcom/facebook/auth/protocol/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/g;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/g;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 98
    const-class v0, Lcom/facebook/orca/protocol/methods/d;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/h;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 100
    const-class v0, Lcom/facebook/orca/protocol/methods/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/i;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/i;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 102
    const-class v0, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/y;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/y;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 104
    const-class v0, Lcom/facebook/orca/protocol/methods/k;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/m;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/m;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 106
    const-class v0, Lcom/facebook/orca/protocol/methods/j;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/k;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/k;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 108
    const-class v0, Lcom/facebook/orca/protocol/methods/l;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/n;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/n;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 110
    const-class v0, Lcom/facebook/orca/protocol/methods/o;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/p;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/p;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 112
    const-class v0, Lcom/facebook/orca/protocol/methods/s;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/r;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/r;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 114
    const-class v0, Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/q;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/q;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 116
    const-class v0, Lcom/facebook/orca/protocol/methods/n;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/o;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/o;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 118
    const-class v0, Lcom/facebook/contacts/g/a/d;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/j;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/j;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 120
    const-class v0, Lcom/facebook/contacts/g/a/f;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/l;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/l;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 122
    const-class v0, Lcom/facebook/contacts/g/a/g;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/s;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/s;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 124
    const-class v0, Lcom/facebook/orca/protocol/methods/t;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/t;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/t;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 126
    const-class v0, Lcom/facebook/orca/protocol/methods/x;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/u;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/u;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 128
    const-class v0, Lcom/facebook/orca/protocol/methods/af;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/w;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/w;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 130
    const-class v0, Lcom/facebook/contacts/g/a/h;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/x;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/x;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 132
    const-class v0, Lcom/facebook/orca/protocol/methods/al;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/z;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/z;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 134
    const-class v0, Lcom/facebook/orca/protocol/methods/an;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/aa;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/aa;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 136
    const-class v0, Lcom/facebook/orca/protocol/methods/ao;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/ac;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/ac;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 138
    const-class v0, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/ad;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/ad;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 140
    const-class v0, Lcom/facebook/orca/protocol/methods/aw;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/ae;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/ae;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 142
    const-class v0, Lcom/facebook/orca/protocol/methods/bc;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/af;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/af;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 144
    const-class v0, Lcom/facebook/orca/protocol/methods/bd;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/ag;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/ag;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 146
    const-class v0, Lcom/facebook/orca/protocol/methods/ab;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/v;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/v;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 148
    const-class v0, Lcom/facebook/orca/protocol/methods/be;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/ah;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/ah;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 150
    const-class v0, Lcom/facebook/orca/protocol/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/ai;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/protocol/ai;-><init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 152
    const-class v0, Lcom/facebook/orca/a/j;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/a/n;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 154
    const-class v0, Lcom/facebook/orca/a/k;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/protocol/ab;

    invoke-direct {v1, v2}, Lcom/facebook/orca/protocol/ab;-><init>(Lcom/facebook/orca/protocol/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 158
    const-class v0, Lcom/facebook/abtest/qe/f/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/d;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/a/c;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 160
    return-void
.end method
