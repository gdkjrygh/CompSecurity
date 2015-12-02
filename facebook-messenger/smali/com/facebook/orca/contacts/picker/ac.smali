.class public Lcom/facebook/orca/contacts/picker/ac;
.super Lcom/facebook/contacts/picker/a;
.source "ContactPickerFriendsOfFriendsFilter.java"


# instance fields
.field private final b:Lcom/facebook/http/protocol/aq;

.field private final c:Lcom/facebook/orca/protocol/methods/ah;


# direct methods
.method public constructor <init>(Lcom/facebook/http/protocol/aq;Lcom/facebook/orca/protocol/methods/ah;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/facebook/contacts/picker/a;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/ac;->b:Lcom/facebook/http/protocol/aq;

    .line 40
    iput-object p2, p0, Lcom/facebook/orca/contacts/picker/ac;->c:Lcom/facebook/orca/protocol/methods/ah;

    .line 41
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
    .line 78
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_1

    .line 93
    :cond_0
    :goto_0
    return-void

    .line 83
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ac;->b:Lcom/facebook/http/protocol/aq;

    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ac;->c:Lcom/facebook/orca/protocol/methods/ah;

    invoke-interface {v0, v1, p1}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 84
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 86
    invoke-virtual {v0}, Lcom/facebook/user/User;->A()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 87
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-interface {p2, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 90
    :catch_0
    move-exception v0

    .line 91
    const-string v1, "orca:ContactPickerFriendsOfFriendsFilter"

    const-string v2, "Failed to get result"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
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
    .line 98
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

    .line 99
    invoke-virtual {v0}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v2

    .line 100
    if-nez v2, :cond_1

    .line 101
    const-string v2, "orca:ContactPickerFriendsOfFriendsFilter"

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

    .line 104
    :cond_1
    invoke-virtual {v2}, Lcom/facebook/user/UserIdentifier;->c()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/facebook/orca/contacts/picker/ac;->a(Lcom/facebook/user/UserIdentifierKey;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 105
    new-instance v3, Lcom/facebook/user/UserWithIdentifier;

    invoke-direct {v3, v0, v2}, Lcom/facebook/user/UserWithIdentifier;-><init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V

    .line 106
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ac;->a:Lcom/facebook/contacts/picker/v;

    invoke-interface {v0, v3}, Lcom/facebook/contacts/picker/v;->a(Ljava/lang/Object;)Lcom/facebook/contacts/picker/ad;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 109
    :cond_2
    return-void
.end method


# virtual methods
.method protected b(Ljava/lang/CharSequence;)Lcom/facebook/widget/a/i;
    .locals 5

    .prologue
    .line 45
    const-wide/16 v0, 0xa

    invoke-static {v0, v1}, Lcom/facebook/debug/d/e;->b(J)V

    .line 46
    const-string v0, "ContactPickerFriendFilter.Filtering"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 47
    new-instance v2, Lcom/facebook/widget/a/i;

    invoke-direct {v2}, Lcom/facebook/widget/a/i;-><init>()V

    .line 49
    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 50
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    .line 51
    invoke-static {}, Lcom/google/common/a/ik;->b()Ljava/util/LinkedHashMap;

    move-result-object v3

    .line 52
    invoke-direct {p0, v0, v3}, Lcom/facebook/orca/contacts/picker/ac;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 54
    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    .line 55
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v3

    .line 56
    invoke-direct {p0, v0, v3}, Lcom/facebook/orca/contacts/picker/ac;->a(Ljava/util/List;Lcom/google/common/a/et;)V

    .line 57
    invoke-virtual {v3}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 58
    invoke-static {p1, v0}, Lcom/facebook/contacts/picker/l;->a(Ljava/lang/CharSequence;Lcom/google/common/a/es;)Lcom/facebook/contacts/picker/l;

    move-result-object v0

    .line 60
    iput-object v0, v2, Lcom/facebook/widget/a/i;->a:Ljava/lang/Object;

    .line 61
    invoke-virtual {v0}, Lcom/facebook/contacts/picker/l;->c()I

    move-result v0

    iput v0, v2, Lcom/facebook/widget/a/i;->b:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    :goto_1
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 72
    const-string v0, "orca:ContactPickerFriendsOfFriendsFilter"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->c(Ljava/lang/String;)V

    .line 74
    :goto_2
    return-object v2

    .line 49
    :cond_0
    :try_start_1
    const-string v0, ""

    goto :goto_0

    .line 63
    :cond_1
    invoke-static {p1}, Lcom/facebook/contacts/picker/l;->a(Ljava/lang/CharSequence;)Lcom/facebook/contacts/picker/l;

    move-result-object v0

    iput-object v0, v2, Lcom/facebook/widget/a/i;->a:Ljava/lang/Object;

    .line 64
    const/4 v0, -0x1

    iput v0, v2, Lcom/facebook/widget/a/i;->b:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 66
    :catch_0
    move-exception v0

    .line 67
    :try_start_2
    const-string v3, "orca:ContactPickerFriendsOfFriendsFilter"

    const-string v4, "Exception during filtering"

    invoke-static {v3, v4, v0}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    invoke-static {p1}, Lcom/facebook/contacts/picker/l;->b(Ljava/lang/CharSequence;)Lcom/facebook/contacts/picker/l;

    move-result-object v0

    iput-object v0, v2, Lcom/facebook/widget/a/i;->a:Ljava/lang/Object;

    .line 69
    const/4 v0, 0x0

    iput v0, v2, Lcom/facebook/widget/a/i;->b:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 72
    const-string v0, "orca:ContactPickerFriendsOfFriendsFilter"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->c(Ljava/lang/String;)V

    goto :goto_2

    .line 71
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 72
    const-string v1, "orca:ContactPickerFriendsOfFriendsFilter"

    invoke-static {v1}, Lcom/facebook/debug/d/e;->c(Ljava/lang/String;)V

    .line 73
    throw v0
.end method
