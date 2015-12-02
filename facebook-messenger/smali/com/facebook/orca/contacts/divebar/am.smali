.class public Lcom/facebook/orca/contacts/divebar/am;
.super Ljava/lang/Object;
.source "DivebarLoader.java"


# instance fields
.field private final a:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/orca/contacts/divebar/al;",
            ">;"
        }
    .end annotation
.end field

.field private final b:I

.field private final c:I

.field private final d:J

.field private final e:Z


# direct methods
.method public constructor <init>(Ljava/util/EnumSet;IIJZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/orca/contacts/divebar/al;",
            ">;IIJZ)V"
        }
    .end annotation

    .prologue
    .line 229
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 230
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/am;->a:Ljava/util/EnumSet;

    .line 231
    iput p2, p0, Lcom/facebook/orca/contacts/divebar/am;->b:I

    .line 232
    iput p3, p0, Lcom/facebook/orca/contacts/divebar/am;->c:I

    .line 233
    iput-wide p4, p0, Lcom/facebook/orca/contacts/divebar/am;->d:J

    .line 234
    iput-boolean p6, p0, Lcom/facebook/orca/contacts/divebar/am;->e:Z

    .line 235
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/am;)I
    .locals 1

    .prologue
    .line 216
    iget v0, p0, Lcom/facebook/orca/contacts/divebar/am;->b:I

    return v0
.end method

.method static synthetic b(Lcom/facebook/orca/contacts/divebar/am;)I
    .locals 1

    .prologue
    .line 216
    iget v0, p0, Lcom/facebook/orca/contacts/divebar/am;->c:I

    return v0
.end method

.method static synthetic c(Lcom/facebook/orca/contacts/divebar/am;)J
    .locals 2

    .prologue
    .line 216
    iget-wide v0, p0, Lcom/facebook/orca/contacts/divebar/am;->d:J

    return-wide v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    .prologue
    .line 238
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/am;->a:Ljava/util/EnumSet;

    sget-object v1, Lcom/facebook/orca/contacts/divebar/al;->FAVORITE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    invoke-virtual {v0, v1}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b()Z
    .locals 2

    .prologue
    .line 242
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/am;->a:Ljava/util/EnumSet;

    sget-object v1, Lcom/facebook/orca/contacts/divebar/al;->TOP_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    invoke-virtual {v0, v1}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 250
    iget-boolean v0, p0, Lcom/facebook/orca/contacts/divebar/am;->e:Z

    return v0
.end method

.method public d()Z
    .locals 2

    .prologue
    .line 254
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/am;->a:Ljava/util/EnumSet;

    sget-object v1, Lcom/facebook/orca/contacts/divebar/al;->ONLINE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    invoke-virtual {v0, v1}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 2

    .prologue
    .line 259
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/am;->a:Ljava/util/EnumSet;

    sget-object v1, Lcom/facebook/orca/contacts/divebar/al;->MOBILE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    invoke-virtual {v0, v1}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public f()Z
    .locals 2

    .prologue
    .line 263
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/am;->a:Ljava/util/EnumSet;

    sget-object v1, Lcom/facebook/orca/contacts/divebar/al;->OTHER_CONTACTS:Lcom/facebook/orca/contacts/divebar/al;

    invoke-virtual {v0, v1}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public g()Z
    .locals 2

    .prologue
    .line 267
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/am;->a:Ljava/util/EnumSet;

    sget-object v1, Lcom/facebook/orca/contacts/divebar/al;->TOP_GROUPS:Lcom/facebook/orca/contacts/divebar/al;

    invoke-virtual {v0, v1}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
