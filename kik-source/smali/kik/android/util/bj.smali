.class public final Lkik/android/util/bj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field private final b:I

.field private c:Lcom/kik/android/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const-string v0, "kik-internal"

    iput-object v0, p0, Lkik/android/util/bj;->a:Ljava/lang/String;

    .line 32
    const v0, 0x7f02018e

    iput v0, p0, Lkik/android/util/bj;->b:I

    .line 47
    return-void
.end method

.method private static a(Ljava/lang/String;)I
    .locals 2

    .prologue
    const/4 v0, -0x1

    .line 59
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    :cond_0
    move v1, v0

    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 120
    :goto_1
    return v0

    .line 59
    :sswitch_0
    const-string v1, "email"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :sswitch_1
    const-string v1, "name"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :sswitch_2
    const-string v1, "change_password"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    goto :goto_0

    :sswitch_3
    const-string v1, "reset"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x3

    goto :goto_0

    :sswitch_4
    const-string v1, "address_book_matching"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :sswitch_5
    const-string v1, "enter_key_send"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x5

    goto :goto_0

    :sswitch_6
    const-string v1, "chat_bubble_color"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x6

    goto :goto_0

    :sswitch_7
    const-string v1, "auto_download_videos"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x7

    goto :goto_0

    :sswitch_8
    const-string v1, "autoplay_videos"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x8

    goto :goto_0

    :sswitch_9
    const-string v1, "privacy_policy"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x9

    goto :goto_0

    :sswitch_a
    const-string v1, "help"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xa

    goto :goto_0

    :sswitch_b
    const-string v1, "licenses"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xb

    goto :goto_0

    :sswitch_c
    const-string v1, "developers"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xc

    goto/16 :goto_0

    :sswitch_d
    const-string v1, "legal"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xd

    goto/16 :goto_0

    :sswitch_e
    const-string v1, "sound"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xe

    goto/16 :goto_0

    :sswitch_f
    const-string v1, "vibration"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xf

    goto/16 :goto_0

    :sswitch_10
    const-string v1, "LED_color"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x10

    goto/16 :goto_0

    :sswitch_11
    const-string v1, "notify_new_people"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x11

    goto/16 :goto_0

    :sswitch_12
    const-string v1, "block_list"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x12

    goto/16 :goto_0

    .line 61
    :pswitch_0
    const v0, 0x7f0902b6

    .line 62
    goto/16 :goto_1

    .line 64
    :pswitch_1
    const v0, 0x7f0902da

    .line 65
    goto/16 :goto_1

    .line 67
    :pswitch_2
    const v0, 0x7f090069

    .line 68
    goto/16 :goto_1

    .line 70
    :pswitch_3
    const v0, 0x7f0902ff

    .line 71
    goto/16 :goto_1

    .line 73
    :pswitch_4
    const v0, 0x7f09028f

    .line 74
    goto/16 :goto_1

    .line 76
    :pswitch_5
    const v0, 0x7f0902b9

    .line 77
    goto/16 :goto_1

    .line 79
    :pswitch_6
    const v0, 0x7f090231

    .line 80
    goto/16 :goto_1

    .line 82
    :pswitch_7
    const v0, 0x7f09022e

    .line 83
    goto/16 :goto_1

    .line 85
    :pswitch_8
    const v0, 0x7f09022f

    .line 86
    goto/16 :goto_1

    .line 88
    :pswitch_9
    const v0, 0x7f0902f1

    .line 89
    goto/16 :goto_1

    .line 91
    :pswitch_a
    const v0, 0x7f0902c1

    .line 92
    goto/16 :goto_1

    .line 94
    :pswitch_b
    const v0, 0x7f0902d0

    .line 95
    goto/16 :goto_1

    .line 97
    :pswitch_c
    const v0, 0x7f0902b0

    .line 98
    goto/16 :goto_1

    .line 100
    :pswitch_d
    const v0, 0x7f0902cf

    .line 101
    goto/16 :goto_1

    .line 103
    :pswitch_e
    const v0, 0x7f09030b

    .line 104
    goto/16 :goto_1

    .line 106
    :pswitch_f
    const v0, 0x7f090322

    .line 107
    goto/16 :goto_1

    .line 109
    :pswitch_10
    const v0, 0x7f0902ce

    .line 110
    goto/16 :goto_1

    .line 112
    :pswitch_11
    const v0, 0x7f0902e6

    .line 113
    goto/16 :goto_1

    .line 115
    :pswitch_12
    const v0, 0x7f090297

    .line 116
    goto/16 :goto_1

    .line 59
    :sswitch_data_0
    .sparse-switch
        -0x64f1464c -> :sswitch_8
        -0x56d583a1 -> :sswitch_7
        -0x4712a3f1 -> :sswitch_10
        -0x40819511 -> :sswitch_5
        -0x392501b6 -> :sswitch_2
        -0x23c1b478 -> :sswitch_4
        -0x1ac9073c -> :sswitch_11
        -0x4e10d6e -> :sswitch_f
        0x30cf41 -> :sswitch_a
        0x337a8b -> :sswitch_1
        0x5c24b9c -> :sswitch_0
        0x62162b9 -> :sswitch_d
        0x6761d4f -> :sswitch_3
        0x688c90f -> :sswitch_e
        0x34200452 -> :sswitch_b
        0x373ef5c9 -> :sswitch_9
        0x4cab7510 -> :sswitch_12
        0x5aa3b377 -> :sswitch_6
        0x6aec11e9 -> :sswitch_c
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
    .end packed-switch
.end method

.method private static a(I)Lkik/android/chat/fragment/settings/KikPreferenceFragment$a;
    .locals 2

    .prologue
    .line 125
    new-instance v0, Lkik/android/chat/fragment/settings/KikPreferenceFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/settings/KikPreferenceFragment$a;-><init>()V

    .line 126
    invoke-virtual {v0, p0}, Lkik/android/chat/fragment/settings/KikPreferenceFragment$a;->a(I)Lkik/android/chat/fragment/settings/PreferenceFragment$a;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/chat/fragment/settings/PreferenceFragment$a;->a()Lkik/android/chat/fragment/settings/PreferenceFragment$a;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/chat/fragment/settings/PreferenceFragment$a;->d()Lkik/android/chat/fragment/settings/PreferenceFragment$a;

    .line 127
    return-object v0
.end method


# virtual methods
.method public final a(Lcom/kik/android/a;)V
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lkik/android/util/bj;->c:Lcom/kik/android/a;

    .line 52
    return-void
.end method

.method public final a(Ljava/lang/String;Landroid/app/Activity;)Z
    .locals 12

    .prologue
    .line 228
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 229
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v2, "kik-internal"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 230
    :cond_0
    const/4 v0, 0x0

    .line 242
    :goto_0
    return v0

    .line 232
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 233
    invoke-virtual {v1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    invoke-virtual {v1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 235
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 236
    invoke-virtual {v1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v0

    .line 237
    if-eqz v0, :cond_2

    .line 238
    const-string v3, "&"

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    const/4 v0, 0x0

    :goto_1
    if-ge v0, v4, :cond_2

    aget-object v6, v3, v0

    .line 239
    invoke-virtual {v1, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 242
    :cond_2
    const-string v0, "callout"

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    const/4 v2, 0x0

    const/4 v1, 0x0

    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v3, -0x1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    :cond_3
    move v0, v3

    :goto_2
    packed-switch v0, :pswitch_data_1

    move-object v8, v1

    move v9, v2

    :goto_3
    if-eqz v8, :cond_a

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-static {}, Lkik/android/chat/KikApplication;->i()Lkik/android/a/b;

    move-result-object v2

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    const-string v0, "URI"

    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "source"

    const-string v1, "contentMessage"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string v4, "calloutShown"

    if-eqz v9, :cond_9

    const-wide/16 v0, 0x1

    :goto_4
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v5, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "fromVerifiedAccount"

    const-wide/16 v10, 0x1

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v1

    sget-object v2, Lcom/kik/d/b/a$k;->X:Lcom/kik/d/b/a$k;

    const/4 v4, 0x0

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual/range {v1 .. v7}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;J)V

    iget-object v0, p0, Lkik/android/util/bj;->c:Lcom/kik/android/a;

    const-string v1, "Deep Link Tapped"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Source"

    const-string v2, "contentMessage"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "URI"

    invoke-virtual {v0, v1, p1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Callout Shown"

    invoke-virtual {v0, v1, v9}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "From Verified Account"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    invoke-static {v8, p2}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    const/4 v0, 0x1

    goto/16 :goto_0

    :pswitch_0
    const-string v4, "settings"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    goto/16 :goto_2

    :pswitch_1
    new-instance v1, Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;-><init>()V

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v3, 0x1

    if-le v0, v3, :cond_5

    const/4 v3, 0x0

    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v4, -0x1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    :cond_4
    move v0, v4

    :goto_5
    packed-switch v0, :pswitch_data_2

    const/4 v1, 0x0

    :cond_5
    :goto_6
    instance-of v0, v1, Lkik/android/chat/fragment/settings/PreferenceFragment$a;

    if-eqz v0, :cond_b

    move-object v0, v1

    check-cast v0, Lkik/android/chat/fragment/settings/PreferenceFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/settings/PreferenceFragment$a;->c()Ljava/lang/String;

    move-result-object v0

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const/4 v0, 0x1

    move-object v8, v1

    move v9, v0

    goto/16 :goto_3

    :sswitch_0
    const-string v7, "share_profile"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    goto :goto_5

    :sswitch_1
    const-string v7, "set_photo"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_5

    :sswitch_2
    const-string v7, "your_account"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x2

    goto :goto_5

    :sswitch_3
    const-string v7, "notifications"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x3

    goto :goto_5

    :sswitch_4
    const-string v7, "chat_settings"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x4

    goto :goto_5

    :sswitch_5
    const-string v7, "help_about_us"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x5

    goto :goto_5

    :sswitch_6
    const-string v7, "kik_code"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x6

    goto :goto_5

    :pswitch_2
    move-object v0, v1

    check-cast v0, Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;->c()Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;

    :cond_6
    :goto_7
    if-lez v3, :cond_8

    if-eqz v6, :cond_8

    move-object v0, v1

    check-cast v0, Lkik/android/chat/fragment/settings/PreferenceFragment$a;

    invoke-static {v3}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lkik/android/chat/fragment/settings/PreferenceFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/settings/PreferenceFragment$a;

    goto :goto_6

    :pswitch_3
    new-instance v0, Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;-><init>()V

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;->a()Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;

    move-result-object v1

    goto :goto_7

    :pswitch_4
    const v0, 0x7f070077

    invoke-static {v0}, Lkik/android/util/bj;->a(I)Lkik/android/chat/fragment/settings/KikPreferenceFragment$a;

    move-result-object v1

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v4, 0x2

    if-le v0, v4, :cond_6

    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lkik/android/util/bj;->a(Ljava/lang/String;)I

    move-result v0

    move v3, v0

    goto :goto_7

    :pswitch_5
    const v0, 0x7f07007a

    invoke-static {v0}, Lkik/android/util/bj;->a(I)Lkik/android/chat/fragment/settings/KikPreferenceFragment$a;

    move-result-object v1

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v4, 0x2

    if-le v0, v4, :cond_6

    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lkik/android/util/bj;->a(Ljava/lang/String;)I

    move-result v0

    move v3, v0

    goto :goto_7

    :pswitch_6
    const v0, 0x7f070078

    invoke-static {v0}, Lkik/android/util/bj;->a(I)Lkik/android/chat/fragment/settings/KikPreferenceFragment$a;

    move-result-object v1

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v4, 0x2

    if-le v0, v4, :cond_6

    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v4, "block_list"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v4, 0x3

    if-le v0, v4, :cond_7

    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v4, "select_user_to_block"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v1, Lkik/android/chat/fragment/KikAddToBlockFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikAddToBlockFragment$a;-><init>()V

    goto/16 :goto_7

    :cond_7
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lkik/android/util/bj;->a(Ljava/lang/String;)I

    move-result v0

    move v3, v0

    goto/16 :goto_7

    :pswitch_7
    const v0, 0x7f070076

    invoke-static {v0}, Lkik/android/util/bj;->a(I)Lkik/android/chat/fragment/settings/KikPreferenceFragment$a;

    move-result-object v1

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v4, 0x2

    if-le v0, v4, :cond_6

    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lkik/android/util/bj;->a(Ljava/lang/String;)I

    move-result v0

    move v3, v0

    goto/16 :goto_7

    :pswitch_8
    new-instance v0, Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->a(Z)Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    move-result-object v0

    sget-object v1, Lkik/android/chat/fragment/ScanCodeTabFragment$c;->e:Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->a(Lkik/android/chat/fragment/ScanCodeTabFragment$c;)Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    move-result-object v1

    goto/16 :goto_7

    :cond_8
    if-gez v3, :cond_5

    const/4 v1, 0x0

    goto/16 :goto_6

    :cond_9
    const-wide/16 v0, 0x0

    goto/16 :goto_4

    :cond_a
    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_b
    move-object v8, v1

    move v9, v2

    goto/16 :goto_3

    :pswitch_data_0
    .packed-switch 0x5582bc23
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x2c5262d6 -> :sswitch_4
        -0x2673ffe1 -> :sswitch_6
        0x4d883ce -> :sswitch_5
        0x248dfe21 -> :sswitch_2
        0x375f0c15 -> :sswitch_1
        0x4bd694e8 -> :sswitch_3
        0x71813149 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method
