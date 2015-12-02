.class public Lcom/facebook/contacts/service/d;
.super Lcom/facebook/inject/c;
.source "ContactsServiceModule.java"


# instance fields
.field private a:Lcom/facebook/fbservice/service/p;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 122
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 33
    const-class v0, Lcom/facebook/backgroundtasks/f;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/service/d;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 34
    const-class v0, Lcom/facebook/d/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/service/d;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 36
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/service/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/service/AddressBookQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/service/g;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/service/g;-><init>(Lcom/facebook/contacts/service/d;Lcom/facebook/contacts/service/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 40
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/service/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/service/ContactsUploadQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/service/i;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/service/i;-><init>(Lcom/facebook/contacts/service/d;Lcom/facebook/contacts/service/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 44
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/service/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/service/ContactsInviteQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/service/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/service/h;-><init>(Lcom/facebook/contacts/service/d;Lcom/facebook/contacts/service/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 49
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/service/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/service/DynamicContactDataQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/service/j;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/service/j;-><init>(Lcom/facebook/contacts/service/d;Lcom/facebook/contacts/service/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 54
    const-class v0, Lcom/facebook/contacts/service/l;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/service/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/service/k;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/service/k;-><init>(Lcom/facebook/contacts/service/d;Lcom/facebook/contacts/service/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 56
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/contacts/service/d;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/service/l;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 59
    const-class v0, Lcom/facebook/contacts/database/f;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/service/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/service/f;

    invoke-direct {v1, v2}, Lcom/facebook/contacts/service/f;-><init>(Lcom/facebook/contacts/service/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 62
    const-class v0, Lcom/facebook/backgroundtasks/c;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/service/d;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/database/f;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 64
    return-void
.end method

.method public a(Lcom/facebook/inject/t;)V
    .locals 1

    .prologue
    .line 68
    const-class v0, Lcom/facebook/fbservice/service/p;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/p;

    iput-object v0, p0, Lcom/facebook/contacts/service/d;->a:Lcom/facebook/fbservice/service/p;

    .line 69
    return-void
.end method
