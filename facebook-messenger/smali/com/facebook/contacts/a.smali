.class public Lcom/facebook/contacts/a;
.super Lcom/facebook/inject/c;
.source "ContactsLibModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 117
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 738
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 121
    new-instance v0, Lcom/facebook/contacts/service/d;

    invoke-direct {v0}, Lcom/facebook/contacts/service/d;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 122
    const-class v0, Lcom/facebook/d/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 124
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/annotations/IsMoreLastActiveEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/i/b;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 127
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/annotations/IsMobileAppDataEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 131
    const-class v0, Lcom/facebook/contacts/g/c;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/i;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/i;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 134
    const-class v0, Lcom/facebook/contacts/data/k;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/x;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/x;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 136
    const-class v0, Lcom/facebook/contacts/data/l;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/y;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/y;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 138
    const-class v0, Lcom/facebook/contacts/data/a/b;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/h;

    invoke-direct {v1, v2}, Lcom/facebook/contacts/h;-><init>(Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 141
    const-class v0, Lcom/facebook/contacts/data/m;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/aa;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/aa;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 144
    const-class v0, Lcom/facebook/contacts/data/n;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/z;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/z;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 146
    const-class v0, Lcom/facebook/contacts/service/a;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/c;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/c;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 149
    const-class v0, Lcom/facebook/contacts/g/h;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/ah;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/ah;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 151
    const-class v0, Lcom/facebook/contacts/g/i;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/ai;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/ai;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 153
    const-class v0, Lcom/facebook/contacts/g/f;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/af;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/af;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 155
    const-class v0, Lcom/facebook/contacts/g/j;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/aj;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/aj;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 157
    const-class v0, Lcom/facebook/contacts/g/k;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/ao;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/ao;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 159
    const-class v0, Lcom/facebook/contacts/g/b;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/g;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/g;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 161
    const-class v0, Lcom/facebook/contacts/g/g;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/ag;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/ag;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 164
    const-class v0, Lcom/facebook/contacts/c/b;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/annotations/ForContactSummary;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/ak;

    invoke-direct {v1, v2}, Lcom/facebook/contacts/ak;-><init>(Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 168
    const-class v0, Lcom/facebook/contacts/c/d;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/annotations/ForContactSummary;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/al;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/al;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 172
    const-class v0, Lcom/facebook/contacts/a/b;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/n;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/n;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 175
    const-class v0, Lcom/facebook/contacts/a/c;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/ab;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/ab;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 178
    const-class v0, Lcom/facebook/contacts/a/d;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/ad;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/ad;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 182
    const-class v0, Lcom/facebook/contacts/data/x;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/ae;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/ae;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 185
    const-class v0, Lcom/facebook/contacts/data/c;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/q;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/q;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 188
    const-class v0, Lcom/facebook/contacts/data/b;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/p;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/p;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 191
    const-class v0, Lcom/facebook/contacts/data/a;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/l;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/l;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 195
    const-class v0, Lcom/facebook/contacts/models/g;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/m;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/m;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 197
    const-class v0, Lcom/facebook/user/a/l;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/am;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/am;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 200
    const-class v0, Lcom/facebook/phonenumbers/PhoneNumberUtil;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/an;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/an;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 204
    const-class v0, Lcom/facebook/contacts/models/e;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/k;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/k;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 206
    const-class v0, Lcom/facebook/contacts/e/c;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/w;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/w;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 209
    const-class v0, Lcom/facebook/contacts/e/a;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/v;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/v;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 211
    const-class v0, Lcom/facebook/user/e;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/e/a;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 214
    const-class v0, Lcom/facebook/contacts/service/b;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/e;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/e;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 216
    const-class v0, Lcom/facebook/contacts/service/c;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/s;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/s;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 218
    const-class v0, Lcom/facebook/contacts/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/j;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/j;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 220
    const-class v0, Lcom/facebook/contacts/upload/c;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/t;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/t;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 223
    const-class v0, Lcom/facebook/contacts/upload/f;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/u;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/u;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 225
    const-class v0, Lcom/facebook/contacts/d/a;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/r;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/r;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 227
    const-class v0, Lcom/facebook/contacts/service/m;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/ac;

    invoke-direct {v1, v2}, Lcom/facebook/contacts/ac;-><init>(Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 230
    const-class v0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/d;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/d;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 234
    const-class v0, Lcom/facebook/contacts/database/g;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/o;

    invoke-direct {v1, v2}, Lcom/facebook/contacts/o;-><init>(Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 239
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/service/ContactsQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/f;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/f;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 243
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/service/ContactsSyncQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/f;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/f;-><init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 247
    const-class v0, Lcom/facebook/user/a/n;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/user/a/k;

    invoke-direct {v1}, Lcom/facebook/user/a/k;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Object;)V

    .line 250
    const-class v0, Lcom/facebook/f/f;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/g/a/c;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 254
    const-class v0, Lcom/facebook/auth/f/b;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 256
    const-class v0, Lcom/facebook/auth/f/a;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/a;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/data/b;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 258
    return-void
.end method

.method public a(Lcom/facebook/inject/t;)V
    .locals 3

    .prologue
    .line 262
    invoke-super {p0, p1}, Lcom/facebook/inject/c;->a(Lcom/facebook/inject/t;)V

    .line 265
    const-class v0, Lcom/facebook/d/b/a;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/d/b/a;

    .line 267
    const-class v1, Lcom/facebook/common/process/d;

    invoke-virtual {p1, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/process/d;

    .line 268
    const-class v2, Lcom/facebook/contacts/data/b;

    invoke-interface {v1}, Lcom/facebook/common/process/d;->c()Lcom/facebook/common/process/c;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/facebook/d/b/a;->b(Ljava/lang/Class;Lcom/facebook/common/process/c;)V

    .line 270
    return-void
.end method
