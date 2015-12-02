.class Lcom/facebook/contacts/d;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/database/AddressBookPeriodicRunner;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 646
    iput-object p1, p0, Lcom/facebook/contacts/d;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 646
    invoke-direct {p0, p1}, Lcom/facebook/contacts/d;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/database/AddressBookPeriodicRunner;
    .locals 11

    .prologue
    .line 651
    new-instance v0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-virtual {p0}, Lcom/facebook/contacts/d;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-virtual {p0}, Lcom/facebook/contacts/d;->e()Lcom/facebook/inject/ab;

    move-result-object v2

    const-class v3, Landroid/app/AlarmManager;

    invoke-interface {v2, v3}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/AlarmManager;

    const-class v3, Lcom/facebook/contacts/data/k;

    invoke-virtual {p0, v3}, Lcom/facebook/contacts/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/contacts/data/k;

    const-class v4, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v4}, Lcom/facebook/contacts/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/auth/b/b;

    invoke-virtual {p0}, Lcom/facebook/contacts/d;->e()Lcom/facebook/inject/ab;

    move-result-object v5

    const-class v6, Lcom/facebook/fbservice/ops/k;

    invoke-interface {v5, v6}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/fbservice/ops/k;

    const-class v6, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v6}, Lcom/facebook/contacts/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/common/time/a;

    const-class v7, Ljava/util/concurrent/ExecutorService;

    const-class v8, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {p0, v7, v8}, Lcom/facebook/contacts/d;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/concurrent/ExecutorService;

    const-class v8, Ljava/lang/Boolean;

    const-class v9, Lcom/facebook/backgroundtasks/AreBackgroundTasksEnabled;

    invoke-virtual {p0, v8, v9}, Lcom/facebook/contacts/d;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v8

    const-class v9, Lcom/facebook/common/v/a;

    invoke-virtual {p0, v9}, Lcom/facebook/contacts/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/common/v/a;

    const-class v10, Lcom/facebook/config/a/d;

    invoke-virtual {p0, v10}, Lcom/facebook/contacts/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/config/a/d;

    invoke-direct/range {v0 .. v10}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;-><init>(Landroid/content/Context;Landroid/app/AlarmManager;Lcom/facebook/contacts/data/k;Lcom/facebook/auth/b/b;Lcom/facebook/fbservice/ops/k;Lcom/facebook/common/time/a;Ljava/util/concurrent/ExecutorService;Ljavax/inject/a;Lcom/facebook/common/v/a;Lcom/facebook/config/a/d;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 646
    invoke-virtual {p0}, Lcom/facebook/contacts/d;->a()Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    move-result-object v0

    return-object v0
.end method
