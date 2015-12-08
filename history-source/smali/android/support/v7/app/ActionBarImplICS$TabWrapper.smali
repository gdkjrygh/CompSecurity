.class Landroid/support/v7/app/ActionBarImplICS$TabWrapper;
.super Landroid/support/v7/app/ActionBar$Tab;
.source "ActionBarImplICS.java"

# interfaces
.implements Landroid/app/ActionBar$TabListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/app/ActionBarImplICS;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "TabWrapper"
.end annotation


# instance fields
.field private mContentDescription:Ljava/lang/CharSequence;

.field private mTabListener:Landroid/support/v7/app/ActionBar$TabListener;

.field private mTag:Ljava/lang/Object;

.field final mWrappedTab:Landroid/app/ActionBar$Tab;

.field final synthetic this$0:Landroid/support/v7/app/ActionBarImplICS;


# direct methods
.method public constructor <init>(Landroid/support/v7/app/ActionBarImplICS;Landroid/app/ActionBar$Tab;)V
    .locals 0
    .param p2, "tab"    # Landroid/app/ActionBar$Tab;

    .prologue
    .line 455
    iput-object p1, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->this$0:Landroid/support/v7/app/ActionBarImplICS;

    invoke-direct {p0}, Landroid/support/v7/app/ActionBar$Tab;-><init>()V

    .line 456
    iput-object p2, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;

    .line 457
    return-void
.end method


# virtual methods
.method public getContentDescription()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 552
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mContentDescription:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getCustomView()Landroid/view/View;
    .locals 1

    .prologue
    .line 512
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;

    invoke-virtual {v0}, Landroid/app/ActionBar$Tab;->getCustomView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public getIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 466
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;

    invoke-virtual {v0}, Landroid/app/ActionBar$Tab;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getPosition()I
    .locals 1

    .prologue
    .line 461
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;

    invoke-virtual {v0}, Landroid/app/ActionBar$Tab;->getPosition()I

    move-result v0

    return v0
.end method

.method public getTag()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 523
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mTag:Ljava/lang/Object;

    return-object v0
.end method

.method public getText()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 471
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;

    invoke-virtual {v0}, Landroid/app/ActionBar$Tab;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public onTabReselected(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V
    .locals 2
    .param p1, "tab"    # Landroid/app/ActionBar$Tab;
    .param p2, "ft"    # Landroid/app/FragmentTransaction;

    .prologue
    .line 571
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mTabListener:Landroid/support/v7/app/ActionBar$TabListener;

    if-eqz p2, :cond_0

    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->this$0:Landroid/support/v7/app/ActionBarImplICS;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarImplICS;->getActiveTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    :goto_0
    invoke-interface {v1, p0, v0}, Landroid/support/v7/app/ActionBar$TabListener;->onTabReselected(Landroid/support/v7/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V

    .line 572
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->this$0:Landroid/support/v7/app/ActionBarImplICS;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarImplICS;->commitActiveTransaction()V

    .line 573
    return-void

    .line 571
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onTabSelected(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V
    .locals 2
    .param p1, "tab"    # Landroid/app/ActionBar$Tab;
    .param p2, "ft"    # Landroid/app/FragmentTransaction;

    .prologue
    .line 558
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mTabListener:Landroid/support/v7/app/ActionBar$TabListener;

    if-eqz p2, :cond_0

    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->this$0:Landroid/support/v7/app/ActionBarImplICS;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarImplICS;->getActiveTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    :goto_0
    invoke-interface {v1, p0, v0}, Landroid/support/v7/app/ActionBar$TabListener;->onTabSelected(Landroid/support/v7/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V

    .line 559
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->this$0:Landroid/support/v7/app/ActionBarImplICS;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarImplICS;->commitActiveTransaction()V

    .line 560
    return-void

    .line 558
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onTabUnselected(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V
    .locals 2
    .param p1, "tab"    # Landroid/app/ActionBar$Tab;
    .param p2, "ft"    # Landroid/app/FragmentTransaction;

    .prologue
    .line 565
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mTabListener:Landroid/support/v7/app/ActionBar$TabListener;

    if-eqz p2, :cond_0

    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->this$0:Landroid/support/v7/app/ActionBarImplICS;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarImplICS;->getActiveTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    :goto_0
    invoke-interface {v1, p0, v0}, Landroid/support/v7/app/ActionBar$TabListener;->onTabUnselected(Landroid/support/v7/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V

    .line 566
    return-void

    .line 565
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public select()V
    .locals 1

    .prologue
    .line 535
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;

    invoke-virtual {v0}, Landroid/app/ActionBar$Tab;->select()V

    .line 536
    return-void
.end method

.method public setContentDescription(I)Landroid/support/v7/app/ActionBar$Tab;
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 540
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->this$0:Landroid/support/v7/app/ActionBarImplICS;

    iget-object v0, v0, Landroid/support/v7/app/ActionBarImplICS;->mActivity:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mContentDescription:Ljava/lang/CharSequence;

    .line 541
    return-object p0
.end method

.method public setContentDescription(Ljava/lang/CharSequence;)Landroid/support/v7/app/ActionBar$Tab;
    .locals 0
    .param p1, "contentDesc"    # Ljava/lang/CharSequence;

    .prologue
    .line 546
    iput-object p1, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mContentDescription:Ljava/lang/CharSequence;

    .line 547
    return-object p0
.end method

.method public setCustomView(I)Landroid/support/v7/app/ActionBar$Tab;
    .locals 1
    .param p1, "layoutResId"    # I

    .prologue
    .line 506
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar$Tab;->setCustomView(I)Landroid/app/ActionBar$Tab;

    .line 507
    return-object p0
.end method

.method public setCustomView(Landroid/view/View;)Landroid/support/v7/app/ActionBar$Tab;
    .locals 1
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 500
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar$Tab;->setCustomView(Landroid/view/View;)Landroid/app/ActionBar$Tab;

    .line 501
    return-object p0
.end method

.method public setIcon(I)Landroid/support/v7/app/ActionBar$Tab;
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 482
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar$Tab;->setIcon(I)Landroid/app/ActionBar$Tab;

    .line 483
    return-object p0
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/support/v7/app/ActionBar$Tab;
    .locals 1
    .param p1, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 476
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar$Tab;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/app/ActionBar$Tab;

    .line 477
    return-object p0
.end method

.method public setTabListener(Landroid/support/v7/app/ActionBar$TabListener;)Landroid/support/v7/app/ActionBar$Tab;
    .locals 2
    .param p1, "listener"    # Landroid/support/v7/app/ActionBar$TabListener;

    .prologue
    .line 528
    iput-object p1, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mTabListener:Landroid/support/v7/app/ActionBar$TabListener;

    .line 529
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;

    if-eqz p1, :cond_0

    move-object v0, p0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/app/ActionBar$Tab;->setTabListener(Landroid/app/ActionBar$TabListener;)Landroid/app/ActionBar$Tab;

    .line 530
    return-object p0

    .line 529
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setTag(Ljava/lang/Object;)Landroid/support/v7/app/ActionBar$Tab;
    .locals 0
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    .line 517
    iput-object p1, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mTag:Ljava/lang/Object;

    .line 518
    return-object p0
.end method

.method public setText(I)Landroid/support/v7/app/ActionBar$Tab;
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 494
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar$Tab;->setText(I)Landroid/app/ActionBar$Tab;

    .line 495
    return-object p0
.end method

.method public setText(Ljava/lang/CharSequence;)Landroid/support/v7/app/ActionBar$Tab;
    .locals 1
    .param p1, "text"    # Ljava/lang/CharSequence;

    .prologue
    .line 488
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar$Tab;->setText(Ljava/lang/CharSequence;)Landroid/app/ActionBar$Tab;

    .line 489
    return-object p0
.end method
