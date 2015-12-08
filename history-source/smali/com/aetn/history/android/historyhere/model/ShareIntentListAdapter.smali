.class public Lcom/aetn/history/android/historyhere/model/ShareIntentListAdapter;
.super Landroid/widget/ArrayAdapter;
.source "ShareIntentListAdapter.java"


# instance fields
.field arrows:[Z

.field context:Landroid/app/Activity;

.field items:[Ljava/lang/Object;

.field layoutId:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;I[Ljava/lang/Object;)V
    .locals 0
    .param p1, "context"    # Landroid/app/Activity;
    .param p2, "layoutId"    # I
    .param p3, "items"    # [Ljava/lang/Object;

    .prologue
    .line 25
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 27
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/ShareIntentListAdapter;->context:Landroid/app/Activity;

    .line 28
    iput-object p3, p0, Lcom/aetn/history/android/historyhere/model/ShareIntentListAdapter;->items:[Ljava/lang/Object;

    .line 29
    iput p2, p0, Lcom/aetn/history/android/historyhere/model/ShareIntentListAdapter;->layoutId:I

    .line 30
    return-void
.end method


# virtual methods
.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .param p1, "pos"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 33
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/model/ShareIntentListAdapter;->context:Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    .line 34
    .local v1, "inflater":Landroid/view/LayoutInflater;
    iget v4, p0, Lcom/aetn/history/android/historyhere/model/ShareIntentListAdapter;->layoutId:I

    const/4 v5, 0x0

    invoke-virtual {v1, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 35
    .local v3, "row":Landroid/view/View;
    const v4, 0x7f0a002f

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 36
    .local v2, "label":Landroid/widget/TextView;
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/model/ShareIntentListAdapter;->items:[Ljava/lang/Object;

    aget-object v4, v4, p1

    check-cast v4, Landroid/content/pm/ResolveInfo;

    iget-object v4, v4, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v5, p0, Lcom/aetn/history/android/historyhere/model/ShareIntentListAdapter;->context:Landroid/app/Activity;

    invoke-virtual {v5}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    const v4, 0x7f0a0040

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 38
    .local v0, "image":Landroid/widget/ImageView;
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/model/ShareIntentListAdapter;->items:[Ljava/lang/Object;

    aget-object v4, v4, p1

    check-cast v4, Landroid/content/pm/ResolveInfo;

    iget-object v4, v4, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v5, p0, Lcom/aetn/history/android/historyhere/model/ShareIntentListAdapter;->context:Landroid/app/Activity;

    invoke-virtual {v5}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/content/pm/ApplicationInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 40
    return-object v3
.end method
