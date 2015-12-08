.class public final Lcom/kik/cards/web/automation/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/cards/web/ap;


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Landroid/app/Activity;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Lcom/kik/cards/web/bd;

.field private h:Ljava/lang/String;

.field private i:Landroid/widget/ScrollView;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/content/Context;Lcom/kik/cards/web/bd;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v5, -0x1

    const/4 v2, -0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const-string v0, "automation"

    iput-object v0, p0, Lcom/kik/cards/web/automation/a;->a:Ljava/lang/String;

    .line 52
    iput-object p1, p0, Lcom/kik/cards/web/automation/a;->b:Landroid/app/Activity;

    .line 53
    iput-object p4, p0, Lcom/kik/cards/web/automation/a;->h:Ljava/lang/String;

    .line 54
    iput-object p3, p0, Lcom/kik/cards/web/automation/a;->g:Lcom/kik/cards/web/bd;

    .line 55
    iget-object v0, p0, Lcom/kik/cards/web/automation/a;->g:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->s()Lcom/kik/cards/web/plugin/JavascriptGlue;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kik/cards/web/plugin/JavascriptGlue;->a(Lcom/kik/cards/web/ap;)V

    .line 56
    new-instance v0, Landroid/widget/ScrollView;

    invoke-direct {v0, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/kik/cards/web/automation/a;->i:Landroid/widget/ScrollView;

    iget-object v0, p0, Lcom/kik/cards/web/automation/a;->i:Landroid/widget/ScrollView;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v1, v5, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/kik/cards/web/automation/a;->i:Landroid/widget/ScrollView;

    const-string v1, "AUTOMATION_SCROLL_VIEW"

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->setContentDescription(Ljava/lang/CharSequence;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v5, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v2, 0x64

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    invoke-virtual {v1, v2, v3, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    iget-object v1, p0, Lcom/kik/cards/web/automation/a;->i:Landroid/widget/ScrollView;

    invoke-virtual {v1, v0}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    iget-object v1, p0, Lcom/kik/cards/web/automation/a;->g:Lcom/kik/cards/web/bd;

    iget-object v2, p0, Lcom/kik/cards/web/automation/a;->i:Landroid/widget/ScrollView;

    invoke-virtual {v1, v2}, Lcom/kik/cards/web/bd;->addView(Landroid/view/View;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/kik/cards/web/automation/a;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/kik/cards/web/automation/a;->c:Landroid/widget/TextView;

    const-string v2, "AUTOMATION_ASYNC_OUTPUT"

    const v3, -0xffff01

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/kik/cards/web/automation/a;->a(Landroid/widget/LinearLayout;Landroid/widget/TextView;Ljava/lang/String;I)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/kik/cards/web/automation/a;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/kik/cards/web/automation/a;->d:Landroid/widget/TextView;

    const-string v2, "AUTOMATION_SYNC_OUTPUT"

    const v3, -0xff0100

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/kik/cards/web/automation/a;->a(Landroid/widget/LinearLayout;Landroid/widget/TextView;Ljava/lang/String;I)V

    new-instance v1, Landroid/widget/EditText;

    invoke-direct {v1, p2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/kik/cards/web/automation/a;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/kik/cards/web/automation/a;->f:Landroid/widget/TextView;

    const-string v2, "AUTOMATION_INJECTION_TEXT_FIELD"

    const/high16 v3, -0x10000

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/kik/cards/web/automation/a;->a(Landroid/widget/LinearLayout;Landroid/widget/TextView;Ljava/lang/String;I)V

    iget-object v1, p0, Lcom/kik/cards/web/automation/a;->f:Landroid/widget/TextView;

    const-string v2, "JSON.stringify(cards._.bridge(\'Browser\').isDebugModeEnabled())"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/kik/cards/web/automation/a;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/kik/cards/web/automation/a;->e:Landroid/widget/TextView;

    const-string v2, "AUTOMATION_CONSOLE_LOG"

    const v3, -0x777778

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/kik/cards/web/automation/a;->a(Landroid/widget/LinearLayout;Landroid/widget/TextView;Ljava/lang/String;I)V

    new-instance v1, Landroid/widget/Button;

    invoke-direct {v1, p2}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    const-string v2, "CLEAR_INPUT"

    invoke-static {v1, v2}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    const-string v2, "Clear input"

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    new-instance v2, Lcom/kik/cards/web/automation/c;

    invoke-direct {v2, p0}, Lcom/kik/cards/web/automation/c;-><init>(Lcom/kik/cards/web/automation/a;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 57
    iget-object v0, p0, Lcom/kik/cards/web/automation/a;->g:Lcom/kik/cards/web/bd;

    const-string v1, "automation"

    invoke-virtual {v0, p0, v1}, Lcom/kik/cards/web/bd;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    iget-object v0, p0, Lcom/kik/cards/web/automation/a;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setRawInputType(I)V

    .line 61
    iget-object v0, p0, Lcom/kik/cards/web/automation/a;->f:Landroid/widget/TextView;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 64
    iget-object v0, p0, Lcom/kik/cards/web/automation/a;->f:Landroid/widget/TextView;

    new-instance v1, Lcom/kik/cards/web/automation/b;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/automation/b;-><init>(Lcom/kik/cards/web/automation/a;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 84
    return-void
.end method

.method static synthetic a(Lcom/kik/cards/web/automation/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/kik/cards/web/automation/a;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/automation/a;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Landroid/widget/LinearLayout;Landroid/widget/TextView;Ljava/lang/String;I)V
    .locals 4

    .prologue
    const/16 v3, 0x14

    const/4 v2, 0x2

    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/kik/cards/web/automation/a;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 150
    invoke-virtual {p2, p4}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 151
    invoke-virtual {p2, v2, v3, v2, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 152
    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 153
    return-void
.end method

.method static synthetic b(Lcom/kik/cards/web/automation/a;)Lcom/kik/cards/web/bd;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/kik/cards/web/automation/a;->g:Lcom/kik/cards/web/bd;

    return-object v0
.end method

.method static synthetic c(Lcom/kik/cards/web/automation/a;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/kik/cards/web/automation/a;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic d(Lcom/kik/cards/web/automation/a;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/kik/cards/web/automation/a;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e(Lcom/kik/cards/web/automation/a;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/kik/cards/web/automation/a;->f:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic f(Lcom/kik/cards/web/automation/a;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/kik/cards/web/automation/a;->c:Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lcom/kik/cards/web/automation/a;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 103
    iget-object v0, p0, Lcom/kik/cards/web/automation/a;->e:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 104
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 170
    iget-object v0, p0, Lcom/kik/cards/web/automation/a;->g:Lcom/kik/cards/web/bd;

    if-eqz v0, :cond_0

    .line 171
    iget-object v0, p0, Lcom/kik/cards/web/automation/a;->g:Lcom/kik/cards/web/bd;

    iget-object v1, p0, Lcom/kik/cards/web/automation/a;->i:Landroid/widget/ScrollView;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/bd;->removeView(Landroid/view/View;)V

    .line 173
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/kik/cards/web/automation/a;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    return-void
.end method
