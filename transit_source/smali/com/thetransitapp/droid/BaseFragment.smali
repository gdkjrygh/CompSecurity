.class public abstract Lcom/thetransitapp/droid/BaseFragment;
.super Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockFragment;
.source "BaseFragment.java"


# static fields
.field private static synthetic $SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen:[I


# instance fields
.field private inputManager:Landroid/view/inputmethod/InputMethodManager;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field private screen:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

.field private view:Landroid/view/View;


# direct methods
.method static synthetic $SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen()[I
    .locals 3

    .prologue
    .line 15
    sget-object v0, Lcom/thetransitapp/droid/BaseFragment;->$SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->values()[Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ABOUT_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_8

    :goto_1
    :try_start_1
    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ITINERARY_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_7

    :goto_2
    :try_start_2
    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LEGAL_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_6

    :goto_3
    :try_start_3
    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LOCATION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_5

    :goto_4
    :try_start_4
    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->NEARBY_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :goto_5
    :try_start_5
    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->OPTION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_3

    :goto_6
    :try_start_6
    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ROUTING_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_2

    :goto_7
    :try_start_7
    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ROUTING_SCREEN_DETAILS:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v1

    const/16 v2, 0x9

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_1

    :goto_8
    :try_start_8
    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->SCHEDULE_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_0

    :goto_9
    sput-object v0, Lcom/thetransitapp/droid/BaseFragment;->$SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_9

    :catch_1
    move-exception v1

    goto :goto_8

    :catch_2
    move-exception v1

    goto :goto_7

    :catch_3
    move-exception v1

    goto :goto_6

    :catch_4
    move-exception v1

    goto :goto_5

    :catch_5
    move-exception v1

    goto :goto_4

    :catch_6
    move-exception v1

    goto :goto_3

    :catch_7
    move-exception v1

    goto :goto_2

    :catch_8
    move-exception v1

    goto :goto_1
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockFragment;-><init>()V

    .line 23
    return-void
.end method

.method public constructor <init>(Lcom/thetransitapp/droid/TransitActivity$TransitScreen;)V
    .locals 0
    .param p1, "screen"    # Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockFragment;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/thetransitapp/droid/BaseFragment;->screen:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    .line 27
    return-void
.end method


# virtual methods
.method public createViewIfNeeded(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroid/view/View;
    .locals 2
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "resId"    # I

    .prologue
    .line 149
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseFragment;->view:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 150
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseFragment;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/thetransitapp/droid/BaseFragment;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 151
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseFragment;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/thetransitapp/droid/BaseFragment;->view:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 157
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseFragment;->view:Landroid/view/View;

    return-object v0

    .line 154
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/thetransitapp/droid/BaseFragment;->view:Landroid/view/View;

    goto :goto_0
.end method

.method public hideKeyboard()V
    .locals 3

    .prologue
    .line 139
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseFragment;->inputManager:Landroid/view/inputmethod/InputMethodManager;

    if-eqz v0, :cond_0

    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockFragment;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 140
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseFragment;->inputManager:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseFragment;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 142
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 31
    const/4 v0, -0x1

    .line 33
    .local v0, "resId":I
    iget-object v1, p0, Lcom/thetransitapp/droid/BaseFragment;->screen:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    if-nez v1, :cond_0

    .line 34
    const/4 v1, 0x0

    .line 65
    :goto_0
    return-object v1

    .line 37
    :cond_0
    invoke-static {}, Lcom/thetransitapp/droid/BaseFragment;->$SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen()[I

    move-result-object v1

    iget-object v2, p0, Lcom/thetransitapp/droid/BaseFragment;->screen:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 65
    :goto_1
    invoke-virtual {p0, p1, p2, v0}, Lcom/thetransitapp/droid/BaseFragment;->createViewIfNeeded(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object v1

    goto :goto_0

    .line 39
    :pswitch_0
    const v0, 0x7f030029

    .line 40
    goto :goto_1

    .line 42
    :pswitch_1
    const v0, 0x7f03002d

    .line 43
    goto :goto_1

    .line 45
    :pswitch_2
    const v0, 0x7f03002c

    .line 46
    goto :goto_1

    .line 48
    :pswitch_3
    const v0, 0x7f03002e

    .line 49
    goto :goto_1

    .line 51
    :pswitch_4
    const v0, 0x7f03002f

    .line 52
    goto :goto_1

    .line 55
    :pswitch_5
    const v0, 0x7f030030

    .line 56
    goto :goto_1

    .line 58
    :pswitch_6
    const v0, 0x7f030031

    .line 59
    goto :goto_1

    .line 61
    :pswitch_7
    const v0, 0x7f03002b

    goto :goto_1

    .line 37
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_5
        :pswitch_2
        :pswitch_1
        :pswitch_6
        :pswitch_4
        :pswitch_0
        :pswitch_7
        :pswitch_5
    .end packed-switch
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 127
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockFragment;->onResume()V

    .line 129
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseFragment;->screen:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    if-eqz v0, :cond_0

    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/TransitActivity;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/TransitActivity;->isDebuggable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 130
    invoke-static {}, Lcom/google/analytics/tracking/android/EasyTracker;->getTracker()Lcom/google/analytics/tracking/android/Tracker;

    move-result-object v0

    iget-object v1, p0, Lcom/thetransitapp/droid/BaseFragment;->screen:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/analytics/tracking/android/Tracker;->sendView(Ljava/lang/String;)V

    .line 133
    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseFragment;->screen:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/thetransitapp/droid/BaseFragment;->screen:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ROUTING_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    if-eq v0, v1, :cond_1

    .line 134
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseFragment;->hideKeyboard()V

    .line 136
    :cond_1
    return-void
.end method

.method public onStart()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 70
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockFragment;->onStart()V

    .line 72
    iget-object v2, p0, Lcom/thetransitapp/droid/BaseFragment;->screen:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    if-nez v2, :cond_1

    .line 123
    :cond_0
    :goto_0
    return-void

    .line 76
    :cond_1
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseFragment;->getSherlockActivity()Lcom/actionbarsherlock/app/SherlockFragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    .line 77
    .local v0, "actionBar":Lcom/actionbarsherlock/app/ActionBar;
    const/4 v1, -0x1

    .line 79
    .local v1, "titleId":I
    invoke-static {}, Lcom/thetransitapp/droid/BaseFragment;->$SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen()[I

    move-result-object v2

    iget-object v3, p0, Lcom/thetransitapp/droid/BaseFragment;->screen:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 108
    :goto_1
    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    .line 109
    invoke-virtual {v0, v4}, Lcom/actionbarsherlock/app/ActionBar;->setNavigationMode(I)V

    .line 110
    invoke-virtual {v0, v5}, Lcom/actionbarsherlock/app/ActionBar;->setDisplayShowTitleEnabled(Z)V

    .line 111
    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 112
    invoke-virtual {v0, v5}, Lcom/actionbarsherlock/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    goto :goto_0

    .line 81
    :pswitch_0
    const v1, 0x7f0a0041

    .line 82
    goto :goto_1

    .line 85
    :pswitch_1
    const v1, 0x7f0a0037

    .line 86
    goto :goto_1

    .line 89
    :pswitch_2
    const v1, 0x7f0a0034

    .line 90
    goto :goto_1

    .line 93
    :pswitch_3
    const v1, 0x7f0a0063

    .line 94
    goto :goto_1

    .line 97
    :pswitch_4
    const v1, 0x7f0a0064

    .line 98
    goto :goto_1

    .line 101
    :pswitch_5
    const v1, 0x7f0a008c

    .line 102
    goto :goto_1

    .line 114
    :cond_2
    invoke-virtual {v0, v5}, Lcom/actionbarsherlock/app/ActionBar;->setNavigationMode(I)V

    .line 115
    invoke-virtual {v0, v4}, Lcom/actionbarsherlock/app/ActionBar;->setDisplayShowTitleEnabled(Z)V

    .line 116
    invoke-virtual {v0, v4}, Lcom/actionbarsherlock/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 117
    invoke-virtual {v0, v4}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 119
    invoke-virtual {v0}, Lcom/actionbarsherlock/app/ActionBar;->getNavigationItemCount()I

    move-result v2

    iget-object v3, p0, Lcom/thetransitapp/droid/BaseFragment;->screen:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v3

    if-lt v2, v3, :cond_0

    .line 120
    iget-object v2, p0, Lcom/thetransitapp/droid/BaseFragment;->screen:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/actionbarsherlock/app/ActionBar;->setSelectedNavigationItem(I)V

    goto :goto_0

    .line 79
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public showKeyboard(Landroid/view/View;)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 145
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseFragment;->inputManager:Landroid/view/inputmethod/InputMethodManager;

    const/4 v1, 0x2

    invoke-virtual {v0, p1, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 146
    return-void
.end method
