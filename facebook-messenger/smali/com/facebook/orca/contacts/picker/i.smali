.class Lcom/facebook/orca/contacts/picker/i;
.super Ljava/lang/Object;
.source "ContactPickerAddFavoritesFilterProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Lcom/facebook/contacts/picker/u;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/contacts/picker/n;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/contacts/picker/bf;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Landroid/content/res/Resources;)V
    .locals 0
    .param p1    # Ljavax/inject/a;
        .annotation runtime Lcom/facebook/orca/contacts/favorites/SupportGroupsInFavorites;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/contacts/picker/n;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/contacts/picker/bf;",
            ">;",
            "Landroid/content/res/Resources;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/i;->a:Ljavax/inject/a;

    .line 33
    iput-object p2, p0, Lcom/facebook/orca/contacts/picker/i;->b:Ljavax/inject/a;

    .line 34
    iput-object p3, p0, Lcom/facebook/orca/contacts/picker/i;->c:Ljavax/inject/a;

    .line 35
    iput-object p4, p0, Lcom/facebook/orca/contacts/picker/i;->d:Landroid/content/res/Resources;

    .line 36
    return-void
.end method

.method private c()Lcom/google/common/a/es;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/picker/ac;",
            ">;"
        }
    .end annotation

    .prologue
    .line 49
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 52
    new-instance v2, Lcom/facebook/contacts/picker/ac;

    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/i;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/u;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v2, v0, v3, v4}, Lcom/facebook/contacts/picker/ac;-><init>(Lcom/facebook/contacts/picker/u;Ljava/lang/String;Z)V

    invoke-virtual {v1, v2}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 57
    new-instance v2, Lcom/facebook/contacts/picker/ac;

    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/i;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/u;

    iget-object v3, p0, Lcom/facebook/orca/contacts/picker/i;->d:Landroid/content/res/Resources;

    sget v4, Lcom/facebook/o;->groups_section_header:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v2, v0, v3, v4}, Lcom/facebook/contacts/picker/ac;-><init>(Lcom/facebook/contacts/picker/u;Ljava/lang/String;Z)V

    invoke-virtual {v1, v2}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 62
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/picker/u;
    .locals 2

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/i;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 41
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/i;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/u;

    .line 44
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/facebook/contacts/picker/x;

    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/i;->c()Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/contacts/picker/x;-><init>(Lcom/google/common/a/es;)V

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 18
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/i;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v0

    return-object v0
.end method
