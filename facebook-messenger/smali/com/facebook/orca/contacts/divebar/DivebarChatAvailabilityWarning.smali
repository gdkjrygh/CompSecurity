.class public Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;
.super Lcom/facebook/orca/common/ui/widgets/f;
.source "DivebarChatAvailabilityWarning.java"


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;

.field private final b:Landroid/widget/Button;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/l/j;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/analytics/av;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 34
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 38
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 42
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/common/ui/widgets/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 44
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 45
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->a:Lcom/facebook/prefs/shared/d;

    .line 46
    const-class v0, Lcom/facebook/l/j;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->c:Ljavax/inject/a;

    .line 47
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->d:Lcom/facebook/analytics/av;

    .line 49
    sget v0, Lcom/facebook/k;->orca_divebar_chat_availability_warning:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->setContentView(I)V

    .line 51
    sget v0, Lcom/facebook/i;->warning_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/animatablelistview/AnimatingItemView;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->setContainer(Lcom/facebook/widget/animatablelistview/AnimatingItemView;)V

    .line 52
    sget v0, Lcom/facebook/i;->chat_availability_turn_on_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->b:Landroid/widget/Button;

    .line 53
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->b:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/contacts/divebar/g;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/divebar/g;-><init>(Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->a()V

    .line 61
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->b()V

    return-void
.end method

.method private b()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 64
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->f()V

    .line 65
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "click"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "button"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "divebar_availability_warning_turn_on"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 68
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->d:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 69
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "chat_bar_online_status_change"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "chat_bar"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "state"

    invoke-virtual {v0, v1, v3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "source"

    const-string v2, "divebar_warning"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 73
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->d:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 74
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/push/b/a;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 75
    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/l/j;

    .line 79
    sget-object v1, Lcom/facebook/l/j;->DISABLED:Lcom/facebook/l/j;

    if-ne v0, v1, :cond_0

    .line 80
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->d()V

    .line 84
    :goto_0
    return-void

    .line 82
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->e()V

    goto :goto_0
.end method
