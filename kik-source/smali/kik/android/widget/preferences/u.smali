.class final Lkik/android/widget/preferences/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceClickListener;


# instance fields
.field final synthetic a:Landroid/preference/Preference$OnPreferenceClickListener;

.field final synthetic b:Lkik/android/widget/preferences/KikModalPreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/KikModalPreference;Landroid/preference/Preference$OnPreferenceClickListener;)V
    .locals 0

    .prologue
    .line 110
    iput-object p1, p0, Lkik/android/widget/preferences/u;->b:Lkik/android/widget/preferences/KikModalPreference;

    iput-object p2, p0, Lkik/android/widget/preferences/u;->a:Landroid/preference/Preference$OnPreferenceClickListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 115
    iget-object v0, p0, Lkik/android/widget/preferences/u;->b:Lkik/android/widget/preferences/KikModalPreference;

    invoke-virtual {v0, p1}, Lkik/android/widget/preferences/KikModalPreference;->onPreferenceClick(Landroid/preference/Preference;)Z

    move-result v0

    .line 117
    if-nez v0, :cond_1

    .line 118
    const/4 v0, 0x0

    .line 131
    :cond_0
    :goto_0
    return v0

    .line 121
    :cond_1
    iget-object v0, p0, Lkik/android/widget/preferences/u;->a:Landroid/preference/Preference$OnPreferenceClickListener;

    invoke-interface {v0, p1}, Landroid/preference/Preference$OnPreferenceClickListener;->onPreferenceClick(Landroid/preference/Preference;)Z

    move-result v0

    .line 123
    if-eqz v0, :cond_0

    .line 124
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 126
    const-string v1, "s"

    iget-object v2, p0, Lkik/android/widget/preferences/u;->b:Lkik/android/widget/preferences/KikModalPreference;

    invoke-static {v2}, Lkik/android/widget/preferences/KikModalPreference;->a(Lkik/android/widget/preferences/KikModalPreference;)Lcom/kik/d/b/a$c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/d/b/a$c;->a()I

    move-result v2

    int-to-long v6, v2

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v5, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    iget-object v1, p0, Lkik/android/widget/preferences/u;->b:Lkik/android/widget/preferences/KikModalPreference;

    iget-object v1, v1, Lkik/android/widget/preferences/KikModalPreference;->b:Lkik/a/e/e;

    invoke-interface {v1}, Lkik/a/e/e;->c()Lcom/kik/d/f;

    move-result-object v1

    sget-object v2, Lcom/kik/d/b/a$k;->M:Lcom/kik/d/b/a$k;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v6

    move-object v4, v3

    invoke-virtual/range {v1 .. v7}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;J)V

    goto :goto_0
.end method
