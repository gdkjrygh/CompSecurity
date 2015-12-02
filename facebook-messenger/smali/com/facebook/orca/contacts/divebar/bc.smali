.class public Lcom/facebook/orca/contacts/divebar/bc;
.super Lcom/facebook/widget/e;
.source "DivebarNewGroupView.java"


# instance fields
.field private a:Lcom/facebook/orca/common/ui/titlebar/a;

.field private b:Lcom/facebook/c/s;

.field private c:Lcom/facebook/analytics/av;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/contacts/divebar/bc;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    .line 33
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/bc;->setOrientation(I)V

    .line 36
    sget v0, Lcom/facebook/k;->orca_divebar_new_group:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/bc;->setContentView(I)V

    .line 38
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 39
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/bc;->c:Lcom/facebook/analytics/av;

    .line 40
    const-class v0, Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/titlebar/a;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/bc;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    .line 41
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/bc;->b:Lcom/facebook/c/s;

    .line 43
    new-instance v0, Lcom/facebook/orca/contacts/divebar/bd;

    invoke-direct {v0, p0}, Lcom/facebook/orca/contacts/divebar/bd;-><init>(Lcom/facebook/orca/contacts/divebar/bc;)V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/bc;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    return-void
.end method

.method private a()V
    .locals 4

    .prologue
    .line 53
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/bc;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/analytics/i/c;->a(Landroid/content/Context;)Lcom/facebook/analytics/av;

    move-result-object v0

    const-string v1, "tap_chat_bar_compose_button"

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bc;->c:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "divebar_compose_btn"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "divebar_state"

    iget-object v3, p0, Lcom/facebook/orca/contacts/divebar/bc;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-virtual {v3}, Lcom/facebook/orca/common/ui/titlebar/a;->d()Lcom/facebook/orca/common/ui/titlebar/m;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/orca/common/ui/titlebar/m;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 60
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/bc;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 61
    sget-object v1, Lcom/facebook/orca/creation/CreateThreadActivity;->r:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 62
    const-string v1, "trigger"

    const-string v2, "divebar_compose_btn"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 63
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/bc;->b:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/bc;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 64
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bc;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->l()V

    .line 65
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/bc;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/bc;->a()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 22
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/bc;->generateDefaultLayoutParams()Landroid/widget/LinearLayout$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method protected generateDefaultLayoutParams()Landroid/widget/LinearLayout$LayoutParams;
    .locals 3

    .prologue
    .line 69
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    return-object v0
.end method
