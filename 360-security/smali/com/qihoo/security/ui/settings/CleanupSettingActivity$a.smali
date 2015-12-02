.class Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/settings/CleanupSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/settings/CleanupSettingActivity;

.field private b:Landroid/content/Context;

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/widget/CheckBoxPreference;",
            ">;"
        }
    .end annotation
.end field

.field private d:I

.field private e:Landroid/app/Dialog;

.field private f:[I

.field private g:I

.field private h:Landroid/view/View$OnClickListener;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/settings/CleanupSettingActivity;Landroid/content/Context;I[ILandroid/view/View$OnClickListener;)V
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->a:Lcom/qihoo/security/ui/settings/CleanupSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p2, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->b:Landroid/content/Context;

    .line 68
    iput p3, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->g:I

    .line 69
    iput-object p4, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->f:[I

    .line 70
    iput-object p5, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->h:Landroid/view/View$OnClickListener;

    .line 71
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 82
    .line 83
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->e:Landroid/app/Dialog;

    if-nez v0, :cond_2

    .line 84
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->g:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 85
    new-instance v0, Lcom/qihoo/security/dialog/i;

    iget-object v1, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/dialog/i;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->e:Landroid/app/Dialog;

    .line 87
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->e:Landroid/app/Dialog;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v4, -0x1

    const/4 v5, -0x2

    invoke-direct {v1, v4, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v3, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->c:Ljava/util/ArrayList;

    move v1, v2

    .line 90
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->f:[I

    array-length v0, v0

    if-ge v1, v0, :cond_1

    .line 91
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->f:[I

    aget v0, v0, v1

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 92
    if-eqz v0, :cond_0

    .line 93
    iget-object v4, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    invoke-virtual {v0, p0}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 97
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->e:Landroid/app/Dialog;

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 101
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v3, v2

    .line 102
    :goto_1
    if-ge v3, v4, :cond_5

    .line 103
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 104
    if-eqz v0, :cond_3

    .line 105
    invoke-virtual {v0}, Lcom/qihoo/security/widget/CheckBoxPreference;->getId()I

    move-result v1

    iget v5, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->d:I

    if-ne v1, v5, :cond_4

    const/4 v1, 0x1

    :goto_2
    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    .line 102
    :cond_3
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    :cond_4
    move v1, v2

    .line 105
    goto :goto_2

    .line 108
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->e:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 109
    return-void
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 112
    iput p1, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->d:I

    .line 113
    invoke-virtual {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->a()V

    .line 114
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->e:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->e:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->cancel()V

    .line 120
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 130
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->d:I

    .line 131
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->h:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->h:Landroid/view/View$OnClickListener;

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 134
    :cond_0
    return-void
.end method
