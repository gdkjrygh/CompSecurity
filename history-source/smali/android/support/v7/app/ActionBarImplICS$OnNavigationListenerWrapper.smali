.class Landroid/support/v7/app/ActionBarImplICS$OnNavigationListenerWrapper;
.super Ljava/lang/Object;
.source "ActionBarImplICS.java"

# interfaces
.implements Landroid/app/ActionBar$OnNavigationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/app/ActionBarImplICS;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "OnNavigationListenerWrapper"
.end annotation


# instance fields
.field private final mWrappedListener:Landroid/support/v7/app/ActionBar$OnNavigationListener;


# direct methods
.method public constructor <init>(Landroid/support/v7/app/ActionBar$OnNavigationListener;)V
    .locals 0
    .param p1, "l"    # Landroid/support/v7/app/ActionBar$OnNavigationListener;

    .prologue
    .line 422
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 423
    iput-object p1, p0, Landroid/support/v7/app/ActionBarImplICS$OnNavigationListenerWrapper;->mWrappedListener:Landroid/support/v7/app/ActionBar$OnNavigationListener;

    .line 424
    return-void
.end method


# virtual methods
.method public onNavigationItemSelected(IJ)Z
    .locals 1
    .param p1, "itemPosition"    # I
    .param p2, "itemId"    # J

    .prologue
    .line 428
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$OnNavigationListenerWrapper;->mWrappedListener:Landroid/support/v7/app/ActionBar$OnNavigationListener;

    invoke-interface {v0, p1, p2, p3}, Landroid/support/v7/app/ActionBar$OnNavigationListener;->onNavigationItemSelected(IJ)Z

    move-result v0

    return v0
.end method
