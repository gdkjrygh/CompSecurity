.class public Lcom/facebook/orca/contacts/divebar/ao;
.super Ljava/lang/Object;
.source "DivebarLoaderFactory.java"


# instance fields
.field private final a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/contacts/divebar/ad;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljavax/inject/a;
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
.method public constructor <init>(Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/contacts/divebar/ad;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/ao;->a:Ljavax/inject/a;

    .line 25
    iput-object p2, p0, Lcom/facebook/orca/contacts/divebar/ao;->b:Ljavax/inject/a;

    .line 27
    iput-object p3, p0, Lcom/facebook/orca/contacts/divebar/ao;->c:Ljavax/inject/a;

    .line 29
    return-void
.end method

.method private e()Ljava/util/EnumSet;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/orca/contacts/divebar/al;",
            ">;"
        }
    .end annotation

    .prologue
    .line 110
    sget-object v0, Lcom/facebook/orca/contacts/divebar/al;->FAVORITE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    sget-object v1, Lcom/facebook/orca/contacts/divebar/al;->ONLINE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    sget-object v2, Lcom/facebook/orca/contacts/divebar/al;->OTHER_CONTACTS:Lcom/facebook/orca/contacts/divebar/al;

    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0
.end method

.method private f()Ljava/util/EnumSet;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/orca/contacts/divebar/al;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 118
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ao;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ao;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move v0, v2

    .line 122
    :goto_0
    if-eqz v0, :cond_2

    .line 123
    sget-object v0, Lcom/facebook/orca/contacts/divebar/al;->FAVORITE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    const/4 v3, 0x5

    new-array v3, v3, [Lcom/facebook/orca/contacts/divebar/al;

    sget-object v4, Lcom/facebook/orca/contacts/divebar/al;->TOP_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    aput-object v4, v3, v1

    sget-object v1, Lcom/facebook/orca/contacts/divebar/al;->TOP_GROUPS:Lcom/facebook/orca/contacts/divebar/al;

    aput-object v1, v3, v2

    const/4 v1, 0x2

    sget-object v2, Lcom/facebook/orca/contacts/divebar/al;->ONLINE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    aput-object v2, v3, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/facebook/orca/contacts/divebar/al;->MOBILE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    aput-object v2, v3, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/facebook/orca/contacts/divebar/al;->OTHER_CONTACTS:Lcom/facebook/orca/contacts/divebar/al;

    aput-object v2, v3, v1

    invoke-static {v0, v3}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    .line 132
    :goto_1
    return-object v0

    :cond_1
    move v0, v1

    .line 118
    goto :goto_0

    .line 132
    :cond_2
    sget-object v0, Lcom/facebook/orca/contacts/divebar/al;->FAVORITE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    sget-object v1, Lcom/facebook/orca/contacts/divebar/al;->TOP_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    sget-object v2, Lcom/facebook/orca/contacts/divebar/al;->TOP_GROUPS:Lcom/facebook/orca/contacts/divebar/al;

    sget-object v3, Lcom/facebook/orca/contacts/divebar/al;->ONLINE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    sget-object v4, Lcom/facebook/orca/contacts/divebar/al;->OTHER_CONTACTS:Lcom/facebook/orca/contacts/divebar/al;

    invoke-static {v0, v1, v2, v3, v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    goto :goto_1
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/divebar/ad;
    .locals 7

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ao;->f()Ljava/util/EnumSet;

    move-result-object v1

    .line 38
    new-instance v0, Lcom/facebook/orca/contacts/divebar/am;

    sget v2, Lcom/facebook/orca/contacts/picker/o;->a:I

    const/16 v3, 0xa

    const-wide/32 v4, 0x48190800

    const/4 v6, 0x1

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/contacts/divebar/am;-><init>(Ljava/util/EnumSet;IIJZ)V

    .line 44
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/ao;->a:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/contacts/divebar/ad;

    .line 45
    invoke-virtual {v1, v0}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/facebook/orca/contacts/divebar/am;)V

    .line 46
    return-object v1
.end method

.method public b()Lcom/facebook/orca/contacts/divebar/ad;
    .locals 7

    .prologue
    .line 55
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ao;->e()Ljava/util/EnumSet;

    move-result-object v1

    .line 56
    new-instance v0, Lcom/facebook/orca/contacts/divebar/am;

    sget v2, Lcom/facebook/orca/contacts/picker/o;->a:I

    const/16 v3, 0xa

    const-wide/32 v4, 0x48190800

    const/4 v6, 0x1

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/contacts/divebar/am;-><init>(Ljava/util/EnumSet;IIJZ)V

    .line 62
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/ao;->a:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/contacts/divebar/ad;

    .line 63
    invoke-virtual {v1, v0}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/facebook/orca/contacts/divebar/am;)V

    .line 64
    return-object v1
.end method

.method public c()Lcom/facebook/orca/contacts/divebar/ad;
    .locals 8

    .prologue
    .line 73
    sget-object v0, Lcom/facebook/orca/contacts/divebar/al;->FAVORITE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    sget-object v1, Lcom/facebook/orca/contacts/divebar/al;->TOP_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    sget-object v2, Lcom/facebook/orca/contacts/divebar/al;->TOP_GROUPS:Lcom/facebook/orca/contacts/divebar/al;

    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v1

    .line 78
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ao;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/facebook/orca/contacts/divebar/ad;

    .line 79
    new-instance v0, Lcom/facebook/orca/contacts/divebar/am;

    sget v2, Lcom/facebook/orca/contacts/picker/o;->a:I

    const/16 v3, 0xa

    const-wide/32 v4, 0x48190800

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/contacts/divebar/am;-><init>(Ljava/util/EnumSet;IIJZ)V

    invoke-virtual {v7, v0}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/facebook/orca/contacts/divebar/am;)V

    .line 86
    return-object v7
.end method

.method public d()Lcom/facebook/orca/contacts/divebar/ad;
    .locals 8

    .prologue
    .line 95
    sget-object v0, Lcom/facebook/orca/contacts/divebar/al;->TOP_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v1

    .line 98
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ao;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/facebook/orca/contacts/divebar/ad;

    .line 99
    new-instance v0, Lcom/facebook/orca/contacts/divebar/am;

    sget v2, Lcom/facebook/orca/contacts/picker/o;->a:I

    const/16 v3, 0xa

    const-wide/32 v4, 0x48190800

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/contacts/divebar/am;-><init>(Ljava/util/EnumSet;IIJZ)V

    invoke-virtual {v7, v0}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/facebook/orca/contacts/divebar/am;)V

    .line 106
    return-object v7
.end method
