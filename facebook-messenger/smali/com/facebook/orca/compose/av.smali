.class public Lcom/facebook/orca/compose/av;
.super Ljava/lang/Object;
.source "LocationNuxController.java"


# instance fields
.field private final a:Lcom/facebook/orca/prefs/az;

.field private b:Lcom/facebook/orca/compose/LocationNuxView;

.field private c:Lcom/facebook/orca/compose/LocationDisabledNuxView;

.field private d:Lcom/facebook/orca/prefs/ba;

.field private e:Lcom/facebook/orca/compose/ax;

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Lcom/facebook/orca/compose/ap;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/prefs/az;)V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    sget-object v0, Lcom/facebook/orca/compose/ax;->OFF:Lcom/facebook/orca/compose/ax;

    iput-object v0, p0, Lcom/facebook/orca/compose/av;->e:Lcom/facebook/orca/compose/ax;

    .line 31
    sget-object v0, Lcom/facebook/orca/compose/ap;->SHRUNK:Lcom/facebook/orca/compose/ap;

    iput-object v0, p0, Lcom/facebook/orca/compose/av;->i:Lcom/facebook/orca/compose/ap;

    .line 35
    iput-object p1, p0, Lcom/facebook/orca/compose/av;->a:Lcom/facebook/orca/prefs/az;

    .line 36
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/compose/av;)Lcom/facebook/orca/compose/ax;
    .locals 1

    .prologue
    .line 11
    invoke-direct {p0}, Lcom/facebook/orca/compose/av;->c()Lcom/facebook/orca/compose/ax;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/compose/av;Lcom/facebook/orca/compose/ax;)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/av;->a(Lcom/facebook/orca/compose/ax;)V

    return-void
.end method

.method private a(Lcom/facebook/orca/compose/ax;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 110
    iget-object v0, p0, Lcom/facebook/orca/compose/av;->e:Lcom/facebook/orca/compose/ax;

    if-ne p1, v0, :cond_1

    .line 126
    :cond_0
    :goto_0
    return-void

    .line 114
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/compose/av;->e:Lcom/facebook/orca/compose/ax;

    sget-object v1, Lcom/facebook/orca/compose/ax;->LOCATION_NUX_SHOWING:Lcom/facebook/orca/compose/ax;

    if-ne v0, v1, :cond_3

    .line 115
    iget-object v0, p0, Lcom/facebook/orca/compose/av;->b:Lcom/facebook/orca/compose/LocationNuxView;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/compose/LocationNuxView;->a(Z)V

    .line 120
    :cond_2
    :goto_1
    iput-object p1, p0, Lcom/facebook/orca/compose/av;->e:Lcom/facebook/orca/compose/ax;

    .line 121
    iget-object v0, p0, Lcom/facebook/orca/compose/av;->e:Lcom/facebook/orca/compose/ax;

    sget-object v1, Lcom/facebook/orca/compose/ax;->LOCATION_NUX_SHOWING:Lcom/facebook/orca/compose/ax;

    if-ne v0, v1, :cond_4

    .line 122
    iget-object v0, p0, Lcom/facebook/orca/compose/av;->b:Lcom/facebook/orca/compose/LocationNuxView;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/compose/LocationNuxView;->a(Z)V

    goto :goto_0

    .line 116
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/compose/av;->e:Lcom/facebook/orca/compose/ax;

    sget-object v1, Lcom/facebook/orca/compose/ax;->LOCATION_DISABLED_NUX_SHOWING:Lcom/facebook/orca/compose/ax;

    if-ne v0, v1, :cond_2

    .line 117
    iget-object v0, p0, Lcom/facebook/orca/compose/av;->c:Lcom/facebook/orca/compose/LocationDisabledNuxView;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->a(Z)V

    goto :goto_1

    .line 123
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/compose/av;->e:Lcom/facebook/orca/compose/ax;

    sget-object v1, Lcom/facebook/orca/compose/ax;->LOCATION_DISABLED_NUX_SHOWING:Lcom/facebook/orca/compose/ax;

    if-ne v0, v1, :cond_0

    .line 124
    iget-object v0, p0, Lcom/facebook/orca/compose/av;->c:Lcom/facebook/orca/compose/LocationDisabledNuxView;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/compose/LocationDisabledNuxView;->a(Z)V

    goto :goto_0
.end method

.method public static a(Lcom/facebook/orca/prefs/az;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 54
    const-string v0, "dismissed_location_disabled_nux"

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/prefs/az;->a(Ljava/lang/String;I)V

    .line 55
    const-string v0, "send_clicked_with_location_disabled_nux"

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/prefs/az;->a(Ljava/lang/String;I)V

    .line 56
    const-string v0, "dismissed_location_nux"

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/prefs/az;->a(Ljava/lang/String;I)V

    .line 57
    const-string v0, "enabled_shared_location_in_message"

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/prefs/az;->a(Ljava/lang/String;I)V

    .line 58
    const-string v0, "disabled_shared_location_in_message"

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/prefs/az;->a(Ljava/lang/String;I)V

    .line 59
    const-string v0, "send_clicked"

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/prefs/az;->a(Ljava/lang/String;I)V

    .line 60
    return-void
.end method

.method private c()Lcom/facebook/orca/compose/ax;
    .locals 2

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/orca/compose/av;->i:Lcom/facebook/orca/compose/ap;

    sget-object v1, Lcom/facebook/orca/compose/ap;->SHRUNK:Lcom/facebook/orca/compose/ap;

    if-eq v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/facebook/orca/compose/av;->h:Z

    if-nez v0, :cond_1

    .line 75
    :cond_0
    sget-object v0, Lcom/facebook/orca/compose/ax;->OFF:Lcom/facebook/orca/compose/ax;

    .line 91
    :goto_0
    return-object v0

    .line 77
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/orca/compose/av;->f:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/facebook/orca/compose/av;->g:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/compose/av;->a:Lcom/facebook/orca/prefs/az;

    const-string v1, "dismissed_location_disabled_nux"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/prefs/az;->a(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/compose/av;->a:Lcom/facebook/orca/prefs/az;

    const-string v1, "send_clicked_with_location_disabled_nux"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/prefs/az;->a(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_2

    .line 81
    sget-object v0, Lcom/facebook/orca/compose/ax;->LOCATION_DISABLED_NUX_SHOWING:Lcom/facebook/orca/compose/ax;

    goto :goto_0

    .line 84
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/compose/av;->a:Lcom/facebook/orca/prefs/az;

    const-string v1, "dismissed_location_nux"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/prefs/az;->a(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/compose/av;->a:Lcom/facebook/orca/prefs/az;

    const-string v1, "send_clicked"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/prefs/az;->a(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/compose/av;->a:Lcom/facebook/orca/prefs/az;

    const-string v1, "enabled_shared_location_in_message"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/prefs/az;->a(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/compose/av;->a:Lcom/facebook/orca/prefs/az;

    const-string v1, "disabled_shared_location_in_message"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/prefs/az;->a(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_3

    .line 88
    sget-object v0, Lcom/facebook/orca/compose/ax;->LOCATION_NUX_SHOWING:Lcom/facebook/orca/compose/ax;

    goto :goto_0

    .line 91
    :cond_3
    sget-object v0, Lcom/facebook/orca/compose/ax;->OFF:Lcom/facebook/orca/compose/ax;

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/orca/compose/av;->e:Lcom/facebook/orca/compose/ax;

    sget-object v1, Lcom/facebook/orca/compose/ax;->LOCATION_DISABLED_NUX_SHOWING:Lcom/facebook/orca/compose/ax;

    if-ne v0, v1, :cond_0

    .line 105
    iget-object v0, p0, Lcom/facebook/orca/compose/av;->a:Lcom/facebook/orca/prefs/az;

    const-string v1, "send_clicked_with_location_disabled_nux"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/prefs/az;->c(Ljava/lang/String;)V

    .line 107
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/orca/compose/LocationNuxView;Lcom/facebook/orca/compose/LocationDisabledNuxView;)V
    .locals 2

    .prologue
    .line 41
    iput-object p1, p0, Lcom/facebook/orca/compose/av;->b:Lcom/facebook/orca/compose/LocationNuxView;

    .line 42
    iput-object p2, p0, Lcom/facebook/orca/compose/av;->c:Lcom/facebook/orca/compose/LocationDisabledNuxView;

    .line 44
    new-instance v0, Lcom/facebook/orca/compose/aw;

    invoke-direct {v0, p0}, Lcom/facebook/orca/compose/aw;-><init>(Lcom/facebook/orca/compose/av;)V

    iput-object v0, p0, Lcom/facebook/orca/compose/av;->d:Lcom/facebook/orca/prefs/ba;

    .line 50
    iget-object v0, p0, Lcom/facebook/orca/compose/av;->a:Lcom/facebook/orca/prefs/az;

    iget-object v1, p0, Lcom/facebook/orca/compose/av;->d:Lcom/facebook/orca/prefs/ba;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/prefs/az;->a(Lcom/facebook/orca/prefs/ba;)V

    .line 51
    return-void
.end method

.method public a(Lcom/facebook/orca/compose/ap;)V
    .locals 1

    .prologue
    .line 95
    iput-object p1, p0, Lcom/facebook/orca/compose/av;->i:Lcom/facebook/orca/compose/ap;

    .line 96
    invoke-direct {p0}, Lcom/facebook/orca/compose/av;->c()Lcom/facebook/orca/compose/ax;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/compose/av;->a(Lcom/facebook/orca/compose/ax;)V

    .line 97
    return-void
.end method

.method public a(ZZZ)V
    .locals 1

    .prologue
    .line 66
    iput-boolean p1, p0, Lcom/facebook/orca/compose/av;->f:Z

    .line 67
    iput-boolean p2, p0, Lcom/facebook/orca/compose/av;->g:Z

    .line 68
    iput-boolean p3, p0, Lcom/facebook/orca/compose/av;->h:Z

    .line 69
    invoke-direct {p0}, Lcom/facebook/orca/compose/av;->c()Lcom/facebook/orca/compose/ax;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/compose/av;->a(Lcom/facebook/orca/compose/ax;)V

    .line 70
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 129
    sget-object v0, Lcom/facebook/orca/compose/ax;->OFF:Lcom/facebook/orca/compose/ax;

    invoke-direct {p0, v0}, Lcom/facebook/orca/compose/av;->a(Lcom/facebook/orca/compose/ax;)V

    .line 130
    return-void
.end method
