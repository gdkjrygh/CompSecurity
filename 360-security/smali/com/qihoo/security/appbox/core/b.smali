.class public Lcom/qihoo/security/appbox/core/b;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Landroid/content/Context;Ljava/lang/String;)Lcom/qihoo/security/appbox/core/a$a;
    .locals 6

    .prologue
    const/4 v2, 0x0

    const-wide/16 v4, 0x0

    .line 41
    new-instance v0, Lcom/qihoo/security/appbox/core/a$a;

    invoke-direct {v0}, Lcom/qihoo/security/appbox/core/a$a;-><init>()V

    .line 42
    const-string/jumbo v1, "0"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 43
    const-string/jumbo v1, "pickers_app_box_data"

    invoke-static {p0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/a$a;->a:Ljava/lang/String;

    .line 44
    const-string/jumbo v1, "pickers_app_box_data_timestamp"

    invoke-static {p0, v1, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/appbox/core/a$a;->b:J

    .line 45
    const-string/jumbo v1, "pickers_app_box_previous_time"

    invoke-static {p0, v1, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/appbox/core/a$a;->c:J

    .line 58
    :cond_0
    :goto_0
    return-object v0

    .line 47
    :cond_1
    const-string/jumbo v1, "1"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 48
    const-string/jumbo v1, "apps_app_box_data"

    invoke-static {p0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/a$a;->a:Ljava/lang/String;

    .line 49
    const-string/jumbo v1, "apps_app_box_data_timestamp"

    invoke-static {p0, v1, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/appbox/core/a$a;->b:J

    .line 50
    const-string/jumbo v1, "apps_app_box_previous_time"

    invoke-static {p0, v1, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/appbox/core/a$a;->c:J

    goto :goto_0

    .line 52
    :cond_2
    const-string/jumbo v1, "2"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 53
    const-string/jumbo v1, "games_app_box_data"

    invoke-static {p0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/a$a;->a:Ljava/lang/String;

    .line 54
    const-string/jumbo v1, "games_app_box_data_timestamp"

    invoke-static {p0, v1, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/appbox/core/a$a;->b:J

    .line 55
    const-string/jumbo v1, "games_app_box_previous_time"

    invoke-static {p0, v1, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/appbox/core/a$a;->c:J

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;J)V
    .locals 0

    .prologue
    .line 102
    invoke-static {p0, p1, p2, p3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 103
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 78
    invoke-static {p0, p1, p2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 1

    .prologue
    .line 62
    const-string/jumbo v0, "0"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 63
    const-string/jumbo v0, "pickers_app_box_data"

    invoke-static {p0, v0, p1}, Lcom/qihoo/security/appbox/core/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const-string/jumbo v0, "pickers_app_box_data_timestamp"

    invoke-static {p0, v0, p5, p6}, Lcom/qihoo/security/appbox/core/b;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 65
    const-string/jumbo v0, "pickers_app_box_previous_time"

    invoke-static {p0, v0, p3, p4}, Lcom/qihoo/security/appbox/core/b;->b(Landroid/content/Context;Ljava/lang/String;J)V

    .line 75
    :cond_0
    :goto_0
    return-void

    .line 66
    :cond_1
    const-string/jumbo v0, "1"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 67
    const-string/jumbo v0, "apps_app_box_data"

    invoke-static {p0, v0, p1}, Lcom/qihoo/security/appbox/core/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    const-string/jumbo v0, "apps_app_box_data_timestamp"

    invoke-static {p0, v0, p5, p6}, Lcom/qihoo/security/appbox/core/b;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 69
    const-string/jumbo v0, "apps_app_box_previous_time"

    invoke-static {p0, v0, p3, p4}, Lcom/qihoo/security/appbox/core/b;->b(Landroid/content/Context;Ljava/lang/String;J)V

    goto :goto_0

    .line 70
    :cond_2
    const-string/jumbo v0, "2"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    const-string/jumbo v0, "games_app_box_data"

    invoke-static {p0, v0, p1}, Lcom/qihoo/security/appbox/core/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    const-string/jumbo v0, "games_app_box_data_timestamp"

    invoke-static {p0, v0, p5, p6}, Lcom/qihoo/security/appbox/core/b;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 73
    const-string/jumbo v0, "games_app_box_previous_time"

    invoke-static {p0, v0, p3, p4}, Lcom/qihoo/security/appbox/core/b;->b(Landroid/content/Context;Ljava/lang/String;J)V

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Z)V
    .locals 1

    .prologue
    .line 90
    const-string/jumbo v0, "app_box_createdShortcut"

    invoke-static {p0, v0, p1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 91
    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 2

    .prologue
    .line 86
    const-string/jumbo v0, "app_box_createdShortcut"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;J)V
    .locals 0

    .prologue
    .line 110
    invoke-static {p0, p1, p2, p3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 111
    return-void
.end method
