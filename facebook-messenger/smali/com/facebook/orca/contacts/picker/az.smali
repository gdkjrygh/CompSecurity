.class public Lcom/facebook/orca/contacts/picker/az;
.super Ljava/lang/Object;
.source "ContactPickerRowsFactory.java"


# instance fields
.field private final a:Lcom/facebook/l/k;

.field private final b:Lcom/facebook/contacts/a/c;

.field private final c:Lcom/facebook/orca/p/e;

.field private final d:Lcom/facebook/orca/contacts/divebar/bn;

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/facebook/orca/contacts/divebar/bp;


# direct methods
.method public constructor <init>(Lcom/facebook/l/k;Lcom/facebook/contacts/a/c;Lcom/facebook/orca/p/e;Lcom/facebook/orca/contacts/divebar/bn;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/l/k;",
            "Lcom/facebook/contacts/a/c;",
            "Lcom/facebook/orca/p/e;",
            "Lcom/facebook/orca/contacts/divebar/bn;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/az;->a:Lcom/facebook/l/k;

    .line 39
    iput-object p2, p0, Lcom/facebook/orca/contacts/picker/az;->b:Lcom/facebook/contacts/a/c;

    .line 40
    iput-object p3, p0, Lcom/facebook/orca/contacts/picker/az;->c:Lcom/facebook/orca/p/e;

    .line 41
    iput-object p4, p0, Lcom/facebook/orca/contacts/picker/az;->d:Lcom/facebook/orca/contacts/divebar/bn;

    .line 42
    iput-object p5, p0, Lcom/facebook/orca/contacts/picker/az;->e:Ljavax/inject/a;

    .line 43
    return-void
.end method

.method private a(Lcom/facebook/user/UserWithIdentifier;ZLcom/facebook/contacts/picker/ah;)Lcom/facebook/contacts/picker/aj;
    .locals 7

    .prologue
    .line 81
    invoke-virtual {p1}, Lcom/facebook/user/UserWithIdentifier;->a()Lcom/facebook/user/User;

    move-result-object v2

    .line 82
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/az;->d:Lcom/facebook/orca/contacts/divebar/bn;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/bn;->a()Lcom/facebook/orca/contacts/divebar/bp;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/az;->f:Lcom/facebook/orca/contacts/divebar/bp;

    .line 85
    sget-object v0, Lcom/facebook/user/s;->FBID:Lcom/facebook/user/s;

    invoke-virtual {p1}, Lcom/facebook/user/UserWithIdentifier;->c()Lcom/facebook/user/UserIdentifier;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/user/UserIdentifier;->e()Lcom/facebook/user/s;

    move-result-object v1

    if-ne v0, v1, :cond_5

    .line 88
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/az;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    sget-object v0, Lcom/facebook/contacts/picker/ai;->TEXT_ONLY:Lcom/facebook/contacts/picker/ai;

    .line 96
    :goto_0
    new-instance v1, Lcom/facebook/contacts/picker/aj;

    invoke-direct {v1}, Lcom/facebook/contacts/picker/aj;-><init>()V

    invoke-virtual {v1, p1}, Lcom/facebook/contacts/picker/aj;->a(Lcom/facebook/user/UserWithIdentifier;)Lcom/facebook/contacts/picker/aj;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/contacts/picker/aj;->a(Lcom/facebook/contacts/picker/ai;)Lcom/facebook/contacts/picker/aj;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/contacts/picker/aj;->c(Z)Lcom/facebook/contacts/picker/aj;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/facebook/contacts/picker/aj;->a(Lcom/facebook/contacts/picker/ah;)Lcom/facebook/contacts/picker/aj;

    move-result-object v1

    .line 102
    if-eqz p2, :cond_0

    .line 103
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/az;->a:Lcom/facebook/l/k;

    invoke-virtual {v2}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/l/k;->a(Lcom/facebook/user/UserKey;)Z

    move-result v3

    .line 104
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/az;->b:Lcom/facebook/contacts/a/c;

    invoke-virtual {v2}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/facebook/contacts/a/c;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/LastActive;

    move-result-object v4

    .line 105
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/az;->a:Lcom/facebook/l/k;

    invoke-virtual {v2}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/facebook/l/k;->b(Lcom/facebook/user/UserKey;)Lcom/facebook/l/x;

    move-result-object v5

    .line 107
    invoke-virtual {v1, v3}, Lcom/facebook/contacts/picker/aj;->a(Z)Lcom/facebook/contacts/picker/aj;

    move-result-object v0

    invoke-virtual {v5}, Lcom/facebook/l/x;->b()Z

    move-result v6

    invoke-virtual {v0, v6}, Lcom/facebook/contacts/picker/aj;->b(Z)Lcom/facebook/contacts/picker/aj;

    move-result-object v0

    iget-object v6, p0, Lcom/facebook/orca/contacts/picker/az;->b:Lcom/facebook/contacts/a/c;

    invoke-virtual {v2}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-virtual {v6, v2}, Lcom/facebook/contacts/a/c;->b(Lcom/facebook/user/UserKey;)Lcom/facebook/user/ChatContext;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/picker/aj;->a(Lcom/facebook/user/ChatContext;)Lcom/facebook/contacts/picker/aj;

    move-result-object v2

    if-nez v3, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/az;->c:Lcom/facebook/orca/p/e;

    sget-object v6, Lcom/facebook/orca/p/f;->SHORT:Lcom/facebook/orca/p/f;

    invoke-virtual {v0, v4, v5, v6}, Lcom/facebook/orca/p/e;->a(Lcom/facebook/user/LastActive;Lcom/facebook/l/x;Lcom/facebook/orca/p/f;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v2, v0}, Lcom/facebook/contacts/picker/aj;->a(Ljava/lang/String;)Lcom/facebook/contacts/picker/aj;

    move-result-object v2

    if-nez v3, :cond_4

    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/az;->c:Lcom/facebook/orca/p/e;

    invoke-virtual {v0, v4, v5}, Lcom/facebook/orca/p/e;->a(Lcom/facebook/user/LastActive;Lcom/facebook/l/x;)I

    move-result v0

    :goto_2
    invoke-virtual {v2, v0}, Lcom/facebook/contacts/picker/aj;->a(I)Lcom/facebook/contacts/picker/aj;

    :cond_0
    move-object v0, v1

    .line 127
    :goto_3
    return-object v0

    .line 90
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/az;->f:Lcom/facebook/orca/contacts/divebar/bp;

    iget-boolean v0, v0, Lcom/facebook/orca/contacts/divebar/bp;->a:Z

    if-eqz v0, :cond_2

    .line 91
    sget-object v0, Lcom/facebook/contacts/picker/ai;->TWO_LINE_RICH_PRESENCE:Lcom/facebook/contacts/picker/ai;

    goto :goto_0

    .line 93
    :cond_2
    sget-object v0, Lcom/facebook/contacts/picker/ai;->ONE_LINE:Lcom/facebook/contacts/picker/ai;

    goto :goto_0

    .line 107
    :cond_3
    const/4 v0, 0x0

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    goto :goto_2

    .line 123
    :cond_5
    new-instance v0, Lcom/facebook/contacts/picker/aj;

    invoke-direct {v0}, Lcom/facebook/contacts/picker/aj;-><init>()V

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/picker/aj;->a(Lcom/facebook/user/UserWithIdentifier;)Lcom/facebook/contacts/picker/aj;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/picker/ai;->TWO_LINE:Lcom/facebook/contacts/picker/ai;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/picker/aj;->a(Lcom/facebook/contacts/picker/ai;)Lcom/facebook/contacts/picker/aj;

    move-result-object v0

    goto :goto_3
.end method


# virtual methods
.method public a(Lcom/facebook/user/UserWithIdentifier;Lcom/facebook/contacts/picker/ah;)Lcom/facebook/contacts/picker/ag;
    .locals 1

    .prologue
    .line 48
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/facebook/orca/contacts/picker/az;->a(Lcom/facebook/user/UserWithIdentifier;ZLcom/facebook/contacts/picker/ah;)Lcom/facebook/contacts/picker/aj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/aj;->a()Lcom/facebook/contacts/picker/ag;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/user/UserWithIdentifier;Lcom/facebook/contacts/picker/ah;Z)Lcom/facebook/contacts/picker/ag;
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 61
    invoke-direct {p0, p1, v1, p2}, Lcom/facebook/orca/contacts/picker/az;->a(Lcom/facebook/user/UserWithIdentifier;ZLcom/facebook/contacts/picker/ah;)Lcom/facebook/contacts/picker/aj;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/picker/aj;->e(Z)Lcom/facebook/contacts/picker/aj;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/facebook/contacts/picker/aj;->d(Z)Lcom/facebook/contacts/picker/aj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/aj;->a()Lcom/facebook/contacts/picker/ag;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/facebook/user/UserWithIdentifier;Lcom/facebook/contacts/picker/ah;)Lcom/facebook/contacts/picker/ag;
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, Lcom/facebook/orca/contacts/picker/az;->a(Lcom/facebook/user/UserWithIdentifier;ZLcom/facebook/contacts/picker/ah;)Lcom/facebook/contacts/picker/aj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/aj;->a()Lcom/facebook/contacts/picker/ag;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/facebook/user/UserWithIdentifier;Lcom/facebook/contacts/picker/ah;Z)Lcom/facebook/contacts/picker/ag;
    .locals 2

    .prologue
    .line 71
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/facebook/orca/contacts/picker/az;->a(Lcom/facebook/user/UserWithIdentifier;ZLcom/facebook/contacts/picker/ah;)Lcom/facebook/contacts/picker/aj;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/picker/aj;->e(Z)Lcom/facebook/contacts/picker/aj;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/facebook/contacts/picker/aj;->d(Z)Lcom/facebook/contacts/picker/aj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/aj;->a()Lcom/facebook/contacts/picker/ag;

    move-result-object v0

    return-object v0
.end method
