.class public Lcom/facebook/orca/contacts/picker/m;
.super Lcom/facebook/contacts/picker/a;
.source "ContactPickerAddressBookFilter.java"


# static fields
.field private static final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/contacts/e/e;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljavax/inject/a;
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
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/facebook/orca/contacts/picker/m;

    sput-object v0, Lcom/facebook/orca/contacts/picker/m;->b:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/contacts/e/e;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 44
    invoke-direct {p0}, Lcom/facebook/contacts/picker/a;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/m;->c:Ljavax/inject/a;

    .line 46
    iput-object p2, p0, Lcom/facebook/orca/contacts/picker/m;->d:Ljavax/inject/a;

    .line 47
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/user/UserKey;",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 107
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/m;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/e/e;

    .line 108
    const/16 v1, 0x1e

    invoke-virtual {v0, p1, v1}, Lcom/facebook/contacts/e/e;->a(Ljava/lang/String;I)V

    .line 111
    :cond_0
    :goto_0
    :try_start_0
    invoke-virtual {v0}, Lcom/facebook/contacts/e/e;->e()Lcom/facebook/user/User;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 113
    invoke-virtual {v1}, Lcom/facebook/user/User;->n()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 114
    invoke-virtual {v1}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-interface {p2, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 118
    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lcom/facebook/contacts/e/e;->c()V

    throw v1

    :cond_1
    invoke-virtual {v0}, Lcom/facebook/contacts/e/e;->c()V

    .line 120
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 123
    new-instance v0, Lcom/facebook/orca/contacts/picker/n;

    invoke-direct {v0, p0}, Lcom/facebook/orca/contacts/picker/n;-><init>(Lcom/facebook/orca/contacts/picker/m;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 137
    return-void
.end method

.method private a(Ljava/util/List;Lcom/google/common/a/et;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/User;",
            ">;",
            "Lcom/google/common/a/et",
            "<",
            "Lcom/facebook/contacts/picker/ad;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 142
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 143
    invoke-virtual {v0}, Lcom/facebook/user/User;->k()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/user/UserPhoneNumber;

    .line 144
    invoke-virtual {v1}, Lcom/facebook/user/UserIdentifier;->c()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/facebook/orca/contacts/picker/m;->a(Lcom/facebook/user/UserIdentifierKey;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 145
    iget-object v4, p0, Lcom/facebook/orca/contacts/picker/m;->a:Lcom/facebook/contacts/picker/v;

    new-instance v5, Lcom/facebook/user/UserWithIdentifier;

    invoke-direct {v5, v0, v1}, Lcom/facebook/user/UserWithIdentifier;-><init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V

    invoke-interface {v4, v5}, Lcom/facebook/contacts/picker/v;->a(Ljava/lang/Object;)Lcom/facebook/contacts/picker/ad;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 149
    :cond_2
    return-void
.end method


# virtual methods
.method protected b(Ljava/lang/CharSequence;)Lcom/facebook/widget/a/i;
    .locals 8

    .prologue
    .line 51
    const-wide/16 v0, 0xa

    invoke-static {v0, v1}, Lcom/facebook/debug/d/e;->b(J)V

    .line 52
    const-string v0, "ContactPickerAddressBookFilter.Filtering"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v2

    .line 53
    new-instance v3, Lcom/facebook/widget/a/i;

    invoke-direct {v3}, Lcom/facebook/widget/a/i;-><init>()V

    .line 55
    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 56
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    .line 57
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    .line 58
    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/contacts/picker/m;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 60
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v4

    .line 61
    invoke-direct {p0, v4}, Lcom/facebook/orca/contacts/picker/m;->a(Ljava/util/List;)V

    .line 63
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v5

    .line 64
    invoke-static {v1}, Landroid/telephony/PhoneNumberUtils;->isWellFormedSmsAddress(Ljava/lang/String;)Z

    move-result v6

    .line 65
    const/4 v0, 0x0

    .line 66
    if-eqz v6, :cond_3

    .line 67
    invoke-static {v1}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->convertAlphaCharactersInNumber(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 68
    new-instance v1, Lcom/facebook/orca/contacts/picker/j;

    sget-object v7, Lcom/facebook/user/s;->PHONE:Lcom/facebook/user/s;

    invoke-direct {v1, v0, v7}, Lcom/facebook/orca/contacts/picker/j;-><init>(Ljava/lang/String;Lcom/facebook/user/s;)V

    invoke-virtual {v5, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    move-object v1, v0

    .line 75
    :goto_1
    invoke-direct {p0, v4, v5}, Lcom/facebook/orca/contacts/picker/m;->a(Ljava/util/List;Lcom/google/common/a/et;)V

    .line 76
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/m;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz v6, :cond_0

    .line 77
    new-instance v0, Lcom/facebook/contacts/picker/t;

    invoke-direct {v0, v1}, Lcom/facebook/contacts/picker/t;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 79
    :cond_0
    invoke-virtual {v5}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 80
    invoke-static {p1, v0}, Lcom/facebook/contacts/picker/l;->a(Ljava/lang/CharSequence;Lcom/google/common/a/es;)Lcom/facebook/contacts/picker/l;

    move-result-object v0

    .line 82
    iput-object v0, v3, Lcom/facebook/widget/a/i;->a:Ljava/lang/Object;

    .line 83
    invoke-virtual {v0}, Lcom/facebook/contacts/picker/l;->c()I

    move-result v0

    iput v0, v3, Lcom/facebook/widget/a/i;->b:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    :goto_2
    invoke-virtual {v2}, Lcom/facebook/debug/d/e;->a()J

    .line 94
    sget-object v0, Lcom/facebook/orca/contacts/picker/m;->b:Ljava/lang/Class;

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/Class;)V

    .line 96
    :goto_3
    return-object v3

    .line 55
    :cond_1
    :try_start_1
    const-string v0, ""

    move-object v1, v0

    goto :goto_0

    .line 85
    :cond_2
    invoke-static {p1}, Lcom/facebook/contacts/picker/l;->a(Ljava/lang/CharSequence;)Lcom/facebook/contacts/picker/l;

    move-result-object v0

    iput-object v0, v3, Lcom/facebook/widget/a/i;->a:Ljava/lang/Object;

    .line 86
    const/4 v0, -0x1

    iput v0, v3, Lcom/facebook/widget/a/i;->b:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 88
    :catch_0
    move-exception v0

    .line 89
    :try_start_2
    sget-object v1, Lcom/facebook/orca/contacts/picker/m;->b:Ljava/lang/Class;

    const-string v4, "Exception during filtering"

    invoke-static {v1, v4, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    invoke-static {p1}, Lcom/facebook/contacts/picker/l;->b(Ljava/lang/CharSequence;)Lcom/facebook/contacts/picker/l;

    move-result-object v0

    iput-object v0, v3, Lcom/facebook/widget/a/i;->a:Ljava/lang/Object;

    .line 91
    const/4 v0, 0x0

    iput v0, v3, Lcom/facebook/widget/a/i;->b:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 93
    invoke-virtual {v2}, Lcom/facebook/debug/d/e;->a()J

    .line 94
    sget-object v0, Lcom/facebook/orca/contacts/picker/m;->b:Ljava/lang/Class;

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/Class;)V

    goto :goto_3

    .line 93
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Lcom/facebook/debug/d/e;->a()J

    .line 94
    sget-object v1, Lcom/facebook/orca/contacts/picker/m;->b:Ljava/lang/Class;

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/Class;)V

    .line 95
    throw v0

    :cond_3
    move-object v1, v0

    goto :goto_1
.end method
