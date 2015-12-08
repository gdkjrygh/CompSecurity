.class public Landroid/support/v7/app/ActionBarImplBase$TabImpl;
.super Landroid/support/v7/app/ActionBar$Tab;
.source "ActionBarImplBase.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/app/ActionBarImplBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TabImpl"
.end annotation


# instance fields
.field private mCallback:Landroid/support/v7/app/ActionBar$TabListener;

.field private mContentDesc:Ljava/lang/CharSequence;

.field private mCustomView:Landroid/view/View;

.field private mIcon:Landroid/graphics/drawable/Drawable;

.field private mPosition:I

.field private mTag:Ljava/lang/Object;

.field private mText:Ljava/lang/CharSequence;

.field final synthetic this$0:Landroid/support/v7/app/ActionBarImplBase;


# direct methods
.method public constructor <init>(Landroid/support/v7/app/ActionBarImplBase;)V
    .locals 1

    .prologue
    .line 627
    iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;

    invoke-direct {p0}, Landroid/support/v7/app/ActionBar$Tab;-><init>()V

    .line 634
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I

    return-void
.end method


# virtual methods
.method public getCallback()Landroid/support/v7/app/ActionBar$TabListener;
    .locals 1

    .prologue
    .line 649
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mCallback:Landroid/support/v7/app/ActionBar$TabListener;

    return-object v0
.end method

.method public getContentDescription()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 746
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mContentDesc:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getCustomView()Landroid/view/View;
    .locals 1

    .prologue
    .line 660
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mCustomView:Landroid/view/View;

    return-object v0
.end method

.method public getIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 680
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getPosition()I
    .locals 1

    .prologue
    .line 685
    iget v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I

    return v0
.end method

.method public getTag()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 639
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mTag:Ljava/lang/Object;

    return-object v0
.end method

.method public getText()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 694
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mText:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public select()V
    .locals 1

    .prologue
    .line 727
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;

    invoke-virtual {v0, p0}, Landroid/support/v7/app/ActionBarImplBase;->selectTab(Landroid/support/v7/app/ActionBar$Tab;)V

    .line 728
    return-void
.end method

.method public setContentDescription(I)Landroid/support/v7/app/ActionBar$Tab;
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 732
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;

    # getter for: Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;
    invoke-static {v0}, Landroid/support/v7/app/ActionBarImplBase;->access$100(Landroid/support/v7/app/ActionBarImplBase;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->setContentDescription(Ljava/lang/CharSequence;)Landroid/support/v7/app/ActionBar$Tab;

    move-result-object v0

    return-object v0
.end method

.method public setContentDescription(Ljava/lang/CharSequence;)Landroid/support/v7/app/ActionBar$Tab;
    .locals 2
    .param p1, "contentDesc"    # Ljava/lang/CharSequence;

    .prologue
    .line 737
    iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mContentDesc:Ljava/lang/CharSequence;

    .line 738
    iget v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I

    if-ltz v0, :cond_0

    .line 739
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;

    # getter for: Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
    invoke-static {v0}, Landroid/support/v7/app/ActionBarImplBase;->access$000(Landroid/support/v7/app/ActionBarImplBase;)Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->updateTab(I)V

    .line 741
    :cond_0
    return-object p0
.end method

.method public setCustomView(I)Landroid/support/v7/app/ActionBar$Tab;
    .locals 2
    .param p1, "layoutResId"    # I

    .prologue
    .line 674
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarImplBase;->getThemedContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->setCustomView(Landroid/view/View;)Landroid/support/v7/app/ActionBar$Tab;

    move-result-object v0

    return-object v0
.end method

.method public setCustomView(Landroid/view/View;)Landroid/support/v7/app/ActionBar$Tab;
    .locals 2
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 665
    iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mCustomView:Landroid/view/View;

    .line 666
    iget v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I

    if-ltz v0, :cond_0

    .line 667
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;

    # getter for: Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
    invoke-static {v0}, Landroid/support/v7/app/ActionBarImplBase;->access$000(Landroid/support/v7/app/ActionBarImplBase;)Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->updateTab(I)V

    .line 669
    :cond_0
    return-object p0
.end method

.method public setIcon(I)Landroid/support/v7/app/ActionBar$Tab;
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 708
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;

    # getter for: Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;
    invoke-static {v0}, Landroid/support/v7/app/ActionBarImplBase;->access$100(Landroid/support/v7/app/ActionBarImplBase;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/support/v7/app/ActionBar$Tab;

    move-result-object v0

    return-object v0
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/support/v7/app/ActionBar$Tab;
    .locals 2
    .param p1, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 699
    iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mIcon:Landroid/graphics/drawable/Drawable;

    .line 700
    iget v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I

    if-ltz v0, :cond_0

    .line 701
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;

    # getter for: Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
    invoke-static {v0}, Landroid/support/v7/app/ActionBarImplBase;->access$000(Landroid/support/v7/app/ActionBarImplBase;)Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->updateTab(I)V

    .line 703
    :cond_0
    return-object p0
.end method

.method public setPosition(I)V
    .locals 0
    .param p1, "position"    # I

    .prologue
    .line 689
    iput p1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I

    .line 690
    return-void
.end method

.method public setTabListener(Landroid/support/v7/app/ActionBar$TabListener;)Landroid/support/v7/app/ActionBar$Tab;
    .locals 0
    .param p1, "callback"    # Landroid/support/v7/app/ActionBar$TabListener;

    .prologue
    .line 654
    iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mCallback:Landroid/support/v7/app/ActionBar$TabListener;

    .line 655
    return-object p0
.end method

.method public setTag(Ljava/lang/Object;)Landroid/support/v7/app/ActionBar$Tab;
    .locals 0
    .param p1, "tag"    # Ljava/lang/Object;

    .prologue
    .line 644
    iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mTag:Ljava/lang/Object;

    .line 645
    return-object p0
.end method

.method public setText(I)Landroid/support/v7/app/ActionBar$Tab;
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 722
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;

    # getter for: Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;
    invoke-static {v0}, Landroid/support/v7/app/ActionBarImplBase;->access$100(Landroid/support/v7/app/ActionBarImplBase;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->setText(Ljava/lang/CharSequence;)Landroid/support/v7/app/ActionBar$Tab;

    move-result-object v0

    return-object v0
.end method

.method public setText(Ljava/lang/CharSequence;)Landroid/support/v7/app/ActionBar$Tab;
    .locals 2
    .param p1, "text"    # Ljava/lang/CharSequence;

    .prologue
    .line 713
    iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mText:Ljava/lang/CharSequence;

    .line 714
    iget v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I

    if-ltz v0, :cond_0

    .line 715
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;

    # getter for: Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
    invoke-static {v0}, Landroid/support/v7/app/ActionBarImplBase;->access$000(Landroid/support/v7/app/ActionBarImplBase;)Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->updateTab(I)V

    .line 717
    :cond_0
    return-object p0
.end method
