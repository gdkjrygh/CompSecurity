.class Lcom/facebook/orca/contacts/picker/bu;
.super Lcom/facebook/inject/d;
.source "MessagesContactPickerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/contacts/divebar/ao;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/bi;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/contacts/picker/bi;)V
    .locals 0

    .prologue
    .line 463
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/bu;->a:Lcom/facebook/orca/contacts/picker/bi;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V
    .locals 0

    .prologue
    .line 463
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/bu;-><init>(Lcom/facebook/orca/contacts/picker/bi;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/divebar/ao;
    .locals 5

    .prologue
    .line 467
    new-instance v0, Lcom/facebook/orca/contacts/divebar/ao;

    const-class v1, Lcom/facebook/orca/contacts/divebar/ad;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/picker/bu;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    const-class v2, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/orca/annotations/IsDivebarMoreMobileFriendsEnabled;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/orca/contacts/picker/bu;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v3, Ljava/lang/Boolean;

    const-class v4, Lcom/facebook/orca/annotations/IsDivebarMoreMobileFriendsNewSectionEnabled;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/orca/contacts/picker/bu;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/orca/contacts/divebar/ao;-><init>(Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 463
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bu;->a()Lcom/facebook/orca/contacts/divebar/ao;

    move-result-object v0

    return-object v0
.end method
