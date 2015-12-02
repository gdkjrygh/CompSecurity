.class public Lcom/facebook/orca/contacts/a/a;
.super Lcom/facebook/inject/d;
.source "ContactPickerListFilterProviderForFacebookList.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/picker/u;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method private f()Lcom/google/common/a/es;
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
    .line 29
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 32
    new-instance v1, Lcom/facebook/contacts/picker/ac;

    const-class v0, Lcom/facebook/contacts/picker/n;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/a/a;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/u;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v1, v0, v3, v4}, Lcom/facebook/contacts/picker/ac;-><init>(Lcom/facebook/contacts/picker/u;Ljava/lang/String;Z)V

    invoke-virtual {v2, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 37
    new-instance v3, Lcom/facebook/contacts/picker/ac;

    const-class v0, Lcom/facebook/orca/contacts/picker/ac;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/a/a;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/u;

    const-class v1, Landroid/content/res/Resources;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/a/a;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/res/Resources;

    sget v4, Lcom/facebook/o;->friends_of_friends_section_header:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v4}, Lcom/facebook/contacts/picker/ac;-><init>(Lcom/facebook/contacts/picker/u;Ljava/lang/String;Z)V

    invoke-virtual {v2, v3}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 42
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/picker/u;
    .locals 2

    .prologue
    .line 24
    new-instance v0, Lcom/facebook/contacts/picker/x;

    invoke-direct {p0}, Lcom/facebook/orca/contacts/a/a;->f()Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/contacts/picker/x;-><init>(Lcom/google/common/a/es;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 19
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/a/a;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v0

    return-object v0
.end method
