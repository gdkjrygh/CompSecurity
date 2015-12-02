.class public Lcom/facebook/orca/contacts/picker/an;
.super Lcom/facebook/widget/f;
.source "ContactPickerListGroupItem.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

.field private final c:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

.field private final d:Lcom/facebook/widget/tiles/ThreadTileView;

.field private final e:Landroid/view/View;

.field private final f:Lcom/facebook/orca/common/ui/widgets/text/a;

.field private final g:Lcom/facebook/orca/photos/a/e;

.field private h:Lcom/facebook/orca/contacts/picker/ad;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const-class v0, Lcom/facebook/orca/contacts/picker/an;

    sput-object v0, Lcom/facebook/orca/contacts/picker/an;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 40
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/contacts/picker/an;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 48
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 49
    sget v0, Lcom/facebook/k;->orca_contact_picker_list_group_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/an;->setContentView(I)V

    .line 50
    sget v0, Lcom/facebook/i;->group_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/an;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/an;->b:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    .line 51
    sget v0, Lcom/facebook/i;->group_description:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/an;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/an;->c:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    .line 52
    sget v0, Lcom/facebook/i;->contact_group_tile_image:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/an;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/tiles/ThreadTileView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/an;->d:Lcom/facebook/widget/tiles/ThreadTileView;

    .line 53
    sget v0, Lcom/facebook/i;->contact_divider:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/an;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/an;->e:Landroid/view/View;

    .line 55
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 56
    const-class v0, Lcom/facebook/orca/common/ui/widgets/text/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/widgets/text/a;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/an;->f:Lcom/facebook/orca/common/ui/widgets/text/a;

    .line 58
    const-class v0, Lcom/facebook/orca/photos/a/e;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/a/e;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/an;->g:Lcom/facebook/orca/photos/a/e;

    .line 60
    return-void
.end method

.method private a()V
    .locals 4

    .prologue
    .line 85
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/an;->h:Lcom/facebook/orca/contacts/picker/ad;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ad;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 86
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/an;->f:Lcom/facebook/orca/common/ui/widgets/text/a;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/common/ui/widgets/text/a;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threadview/v;

    move-result-object v1

    .line 88
    iget-object v2, p0, Lcom/facebook/orca/contacts/picker/an;->b:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    invoke-virtual {v2, v1}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->setData(Ljava/lang/Object;)V

    .line 89
    iget-object v2, p0, Lcom/facebook/orca/contacts/picker/an;->d:Lcom/facebook/widget/tiles/ThreadTileView;

    iget-object v3, p0, Lcom/facebook/orca/contacts/picker/an;->g:Lcom/facebook/orca/photos/a/e;

    invoke-virtual {v3, v0}, Lcom/facebook/orca/photos/a/e;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/widget/tiles/j;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/widget/tiles/ThreadTileView;->setThreadTileViewData(Lcom/facebook/widget/tiles/j;)V

    .line 90
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/an;->c:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    invoke-virtual {v0, v1}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->setData(Ljava/lang/Object;)V

    .line 92
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/an;->c:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->setVisibility(I)V

    .line 96
    :goto_0
    return-void

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/an;->c:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->setVisibility(I)V

    goto :goto_0
.end method


# virtual methods
.method public getContactRow()Lcom/facebook/orca/contacts/picker/ad;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/an;->h:Lcom/facebook/orca/contacts/picker/ad;

    return-object v0
.end method

.method public setColorScheme(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V
    .locals 4

    .prologue
    .line 63
    sget-object v0, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DEFAULT_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    if-ne p1, v0, :cond_1

    .line 73
    :cond_0
    :goto_0
    return-void

    .line 65
    :cond_1
    sget-object v0, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DIVEBAR_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    if-ne p1, v0, :cond_0

    .line 66
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/an;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 67
    sget v1, Lcom/facebook/h;->divebar_contact_bg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/picker/an;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 68
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/an;->e:Landroid/view/View;

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    sget v3, Lcom/facebook/f;->divebar_contact_divider:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 70
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/an;->b:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    sget v2, Lcom/facebook/f;->divebar_contact_name_text:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->setTextColor(I)V

    .line 71
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/an;->c:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    sget v2, Lcom/facebook/f;->divebar_contact_status_text:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->setTextColor(I)V

    goto :goto_0
.end method

.method public setContactRow(Lcom/facebook/orca/contacts/picker/ad;)V
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/an;->h:Lcom/facebook/orca/contacts/picker/ad;

    .line 81
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/an;->a()V

    .line 82
    return-void
.end method
