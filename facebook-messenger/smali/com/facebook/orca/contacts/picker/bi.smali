.class public Lcom/facebook/orca/contacts/picker/bi;
.super Lcom/facebook/inject/c;
.source "MessagesContactPickerModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 104
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 488
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 108
    const-class v0, Lcom/facebook/backgroundtasks/f;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 110
    const-class v0, Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/bq;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/contacts/picker/bq;-><init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 114
    const-class v0, Lcom/facebook/contacts/a/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/cd;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/contacts/picker/cd;-><init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 118
    const-class v0, Lcom/facebook/orca/contacts/favorites/aa;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/by;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/contacts/picker/by;-><init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 121
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsDisplayGroupsInDivebarEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/a/d;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 125
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/favorites/SupportGroupsInFavorites;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/favorites/ak;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 129
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/ShowPresenceInfoInContactPicker;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/picker/cf;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 133
    const-class v0, Lcom/facebook/orca/protocol/methods/i;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/bz;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/contacts/picker/bz;-><init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 137
    const-class v0, Lcom/facebook/contacts/picker/n;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/bl;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/contacts/picker/bl;-><init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 139
    const-class v0, Lcom/facebook/orca/contacts/picker/m;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/bk;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/contacts/picker/bk;-><init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 141
    const-class v0, Lcom/facebook/orca/contacts/picker/ac;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/bm;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/contacts/picker/bm;-><init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 143
    const-class v0, Lcom/facebook/orca/contacts/picker/bf;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/bp;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/contacts/picker/bp;-><init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 145
    const-class v0, Lcom/facebook/orca/contacts/picker/be;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/bo;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/contacts/picker/bo;-><init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 149
    const-class v0, Lcom/facebook/contacts/picker/u;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/ForDivebarList;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/a/k;

    invoke-direct {v1}, Lcom/facebook/orca/contacts/a/k;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 152
    const-class v0, Lcom/facebook/contacts/picker/u;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/ForMergedComposer;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/a/j;

    invoke-direct {v1}, Lcom/facebook/orca/contacts/a/j;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 155
    const-class v0, Lcom/facebook/contacts/picker/u;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/ForFacebookList;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/a/a;

    invoke-direct {v1}, Lcom/facebook/orca/contacts/a/a;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 158
    const-class v0, Lcom/facebook/contacts/picker/u;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/ForAddressBook;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/bk;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/contacts/picker/bk;-><init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 161
    const-class v0, Lcom/facebook/contacts/picker/u;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/ForFavoritePickerList;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/picker/i;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 164
    const-class v0, Lcom/facebook/contacts/picker/u;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/ForContactMultiPicker;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    invoke-static {v2}, Lcom/google/inject/b/a;->a(Ljava/lang/Object;)Ljavax/inject/a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 170
    new-instance v0, Lcom/facebook/orca/contacts/picker/ak;

    const-class v1, Lcom/facebook/orca/annotations/ForFacebookList;

    invoke-direct {v0, v1}, Lcom/facebook/orca/contacts/picker/ak;-><init>(Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 171
    new-instance v0, Lcom/facebook/orca/contacts/picker/ak;

    const-class v1, Lcom/facebook/orca/annotations/ForAddressBook;

    invoke-direct {v0, v1}, Lcom/facebook/orca/contacts/picker/ak;-><init>(Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 172
    new-instance v0, Lcom/facebook/orca/contacts/picker/ak;

    const-class v1, Lcom/facebook/orca/annotations/ForFavoritePickerList;

    invoke-direct {v0, v1}, Lcom/facebook/orca/contacts/picker/ak;-><init>(Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 173
    new-instance v0, Lcom/facebook/orca/contacts/picker/ak;

    const-class v1, Lcom/facebook/orca/annotations/ForDivebarList;

    invoke-direct {v0, v1}, Lcom/facebook/orca/contacts/picker/ak;-><init>(Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 174
    new-instance v0, Lcom/facebook/orca/contacts/picker/ak;

    const-class v1, Lcom/facebook/orca/annotations/ForMergedComposer;

    invoke-direct {v0, v1}, Lcom/facebook/orca/contacts/picker/ak;-><init>(Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 175
    new-instance v0, Lcom/facebook/orca/contacts/picker/ak;

    const-class v1, Lcom/facebook/orca/annotations/ForContactMultiPicker;

    invoke-direct {v0, v1}, Lcom/facebook/orca/contacts/picker/ak;-><init>(Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 177
    const-class v0, Lcom/facebook/orca/contacts/picker/az;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/bn;

    invoke-direct {v1, v2}, Lcom/facebook/orca/contacts/picker/bn;-><init>(Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 180
    const-class v0, Lcom/facebook/orca/contacts/divebar/bk;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/bx;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/contacts/picker/bx;-><init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 184
    const-class v0, Lcom/facebook/orca/contacts/divebar/ad;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/bv;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/contacts/picker/bv;-><init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 186
    const-class v0, Lcom/facebook/orca/contacts/divebar/ao;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/bu;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/contacts/picker/bu;-><init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 191
    const-class v0, Lcom/facebook/orca/contacts/favorites/ag;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/cb;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/contacts/picker/cb;-><init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 193
    const-class v0, Lcom/facebook/orca/contacts/favorites/ai;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/ca;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/contacts/picker/ca;-><init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 198
    const-class v0, Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/bs;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/contacts/picker/bs;-><init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 200
    const-class v0, Lcom/facebook/orca/contacts/picker/bg;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/cc;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/contacts/picker/cc;-><init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 202
    const-class v0, Lcom/facebook/orca/contacts/divebar/h;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/br;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/contacts/picker/br;-><init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 204
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsDivebarContactsUploaderPermitted;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/a/e;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 208
    const-class v0, Lcom/facebook/orca/contacts/divebar/aa;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/bt;

    invoke-direct {v1, v2}, Lcom/facebook/orca/contacts/picker/bt;-><init>(Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 211
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/annotations/IsGroupsMegaphoneEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/a/h;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 215
    const-class v0, Lcom/facebook/orca/contacts/divebar/ap;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/bw;

    invoke-direct {v1, v2}, Lcom/facebook/orca/contacts/picker/bw;-><init>(Lcom/facebook/orca/contacts/picker/bj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 219
    const-class v0, Lcom/facebook/orca/contacts/divebar/bl;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 221
    const-class v0, Lcom/facebook/contacts/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bi;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/a/d;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 224
    return-void
.end method
