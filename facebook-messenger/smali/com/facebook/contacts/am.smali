.class Lcom/facebook/contacts/am;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/user/a/l;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 520
    iput-object p1, p0, Lcom/facebook/contacts/am;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 520
    invoke-direct {p0, p1}, Lcom/facebook/contacts/am;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/user/a/l;
    .locals 6

    .prologue
    .line 524
    const-class v0, Landroid/content/res/Resources;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/am;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/content/res/Resources;

    .line 525
    new-instance v0, Lcom/facebook/user/a/l;

    sget v1, Lcom/facebook/o;->common_name_prefixes:I

    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/facebook/o;->common_last_name_prefixes:I

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/facebook/o;->common_name_suffixes:I

    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    sget v5, Lcom/facebook/o;->common_name_conjunctions:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/facebook/user/a/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 520
    invoke-virtual {p0}, Lcom/facebook/contacts/am;->a()Lcom/facebook/user/a/l;

    move-result-object v0

    return-object v0
.end method
