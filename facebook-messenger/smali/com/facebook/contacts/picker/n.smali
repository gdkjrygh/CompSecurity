.class public Lcom/facebook/contacts/picker/n;
.super Lcom/facebook/contacts/picker/a;
.source "ContactPickerFriendFilter.java"


# instance fields
.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/e;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/facebook/contacts/picker/a;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/facebook/contacts/picker/n;->b:Ljavax/inject/a;

    .line 38
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
    .line 85
    iget-object v0, p0, Lcom/facebook/contacts/picker/n;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/e;

    .line 86
    const/16 v1, 0x1e

    invoke-interface {v0, p1, v1}, Lcom/facebook/user/e;->a(Ljava/lang/String;I)V

    .line 89
    :goto_0
    :try_start_0
    invoke-interface {v0}, Lcom/facebook/user/e;->c()Lcom/facebook/user/User;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 90
    invoke-virtual {v1}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-interface {p2, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 93
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Lcom/facebook/user/e;->d()V

    throw v1

    :cond_0
    invoke-interface {v0}, Lcom/facebook/user/e;->d()V

    .line 95
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
    .line 98
    new-instance v0, Lcom/facebook/contacts/picker/o;

    invoke-direct {v0, p0}, Lcom/facebook/contacts/picker/o;-><init>(Lcom/facebook/contacts/picker/n;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 112
    return-void
.end method

.method private a(Ljava/util/List;Lcom/google/common/a/et;)V
    .locals 5
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
    .line 117
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 118
    invoke-virtual {v0}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v2

    .line 119
    if-nez v2, :cond_1

    .line 120
    const-string v2, "orca:ContactPickerFriendFilter"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Skipping user with no FBID: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 123
    :cond_1
    invoke-virtual {v2}, Lcom/facebook/user/UserIdentifier;->c()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/facebook/contacts/picker/n;->a(Lcom/facebook/user/UserIdentifierKey;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 124
    iget-object v3, p0, Lcom/facebook/contacts/picker/n;->a:Lcom/facebook/contacts/picker/v;

    new-instance v4, Lcom/facebook/user/UserWithIdentifier;

    invoke-direct {v4, v0, v2}, Lcom/facebook/user/UserWithIdentifier;-><init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V

    invoke-interface {v3, v4}, Lcom/facebook/contacts/picker/v;->a(Ljava/lang/Object;)Lcom/facebook/contacts/picker/ad;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 127
    :cond_2
    return-void
.end method


# virtual methods
.method protected b(Ljava/lang/CharSequence;)Lcom/facebook/widget/a/i;
    .locals 5

    .prologue
    .line 42
    const-wide/16 v0, 0xa

    invoke-static {v0, v1}, Lcom/facebook/debug/d/e;->b(J)V

    .line 43
    const-string v0, "ContactPickerFriendFilter.Filtering"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 44
    new-instance v2, Lcom/facebook/widget/a/i;

    invoke-direct {v2}, Lcom/facebook/widget/a/i;-><init>()V

    .line 46
    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 47
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    .line 48
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v3

    .line 49
    invoke-direct {p0, v0, v3}, Lcom/facebook/contacts/picker/n;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 51
    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    .line 52
    invoke-direct {p0, v0}, Lcom/facebook/contacts/picker/n;->a(Ljava/util/List;)V

    .line 54
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v3

    .line 55
    invoke-direct {p0, v0, v3}, Lcom/facebook/contacts/picker/n;->a(Ljava/util/List;Lcom/google/common/a/et;)V

    .line 56
    invoke-virtual {v3}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 57
    invoke-static {p1, v0}, Lcom/facebook/contacts/picker/l;->a(Ljava/lang/CharSequence;Lcom/google/common/a/es;)Lcom/facebook/contacts/picker/l;

    move-result-object v0

    .line 59
    iput-object v0, v2, Lcom/facebook/widget/a/i;->a:Ljava/lang/Object;

    .line 60
    invoke-virtual {v0}, Lcom/facebook/contacts/picker/l;->c()I

    move-result v0

    iput v0, v2, Lcom/facebook/widget/a/i;->b:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    :goto_1
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 71
    const-string v0, "orca:ContactPickerFriendFilter"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->c(Ljava/lang/String;)V

    .line 73
    :goto_2
    return-object v2

    .line 46
    :cond_0
    :try_start_1
    const-string v0, ""

    goto :goto_0

    .line 62
    :cond_1
    invoke-static {p1}, Lcom/facebook/contacts/picker/l;->a(Ljava/lang/CharSequence;)Lcom/facebook/contacts/picker/l;

    move-result-object v0

    iput-object v0, v2, Lcom/facebook/widget/a/i;->a:Ljava/lang/Object;

    .line 63
    const/4 v0, -0x1

    iput v0, v2, Lcom/facebook/widget/a/i;->b:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 65
    :catch_0
    move-exception v0

    .line 66
    :try_start_2
    const-string v3, "orca:ContactPickerFriendFilter"

    const-string v4, "Exception during filtering"

    invoke-static {v3, v4, v0}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    invoke-static {p1}, Lcom/facebook/contacts/picker/l;->b(Ljava/lang/CharSequence;)Lcom/facebook/contacts/picker/l;

    move-result-object v0

    iput-object v0, v2, Lcom/facebook/widget/a/i;->a:Ljava/lang/Object;

    .line 68
    const/4 v0, 0x0

    iput v0, v2, Lcom/facebook/widget/a/i;->b:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 70
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 71
    const-string v0, "orca:ContactPickerFriendFilter"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->c(Ljava/lang/String;)V

    goto :goto_2

    .line 70
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 71
    const-string v1, "orca:ContactPickerFriendFilter"

    invoke-static {v1}, Lcom/facebook/debug/d/e;->c(Ljava/lang/String;)V

    .line 72
    throw v0
.end method
