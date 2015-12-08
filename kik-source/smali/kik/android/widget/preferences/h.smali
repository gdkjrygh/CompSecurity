.class final Lkik/android/widget/preferences/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceChangeListener;


# instance fields
.field final synthetic a:Landroid/preference/Preference$OnPreferenceChangeListener;

.field final synthetic b:Lkik/android/widget/preferences/KikCheckBoxPreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/KikCheckBoxPreference;Landroid/preference/Preference$OnPreferenceChangeListener;)V
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lkik/android/widget/preferences/h;->b:Lkik/android/widget/preferences/KikCheckBoxPreference;

    iput-object p2, p0, Lkik/android/widget/preferences/h;->a:Landroid/preference/Preference$OnPreferenceChangeListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 116
    iget-object v0, p0, Lkik/android/widget/preferences/h;->b:Lkik/android/widget/preferences/KikCheckBoxPreference;

    invoke-virtual {v0, p1, p2}, Lkik/android/widget/preferences/KikCheckBoxPreference;->onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z

    move-result v0

    .line 118
    if-nez v0, :cond_1

    .line 119
    const/4 v0, 0x0

    .line 135
    :cond_0
    :goto_0
    return v0

    .line 122
    :cond_1
    iget-object v1, p0, Lkik/android/widget/preferences/h;->a:Landroid/preference/Preference$OnPreferenceChangeListener;

    if-eqz v1, :cond_2

    .line 123
    iget-object v0, p0, Lkik/android/widget/preferences/h;->a:Landroid/preference/Preference$OnPreferenceChangeListener;

    invoke-interface {v0, p1, p2}, Landroid/preference/Preference$OnPreferenceChangeListener;->onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z

    move-result v0

    .line 126
    :cond_2
    if-eqz v0, :cond_0

    .line 127
    iget-object v1, p0, Lkik/android/widget/preferences/h;->b:Lkik/android/widget/preferences/KikCheckBoxPreference;

    invoke-virtual {v1}, Lkik/android/widget/preferences/KikCheckBoxPreference;->c()V

    .line 128
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 130
    const-string v1, "s"

    iget-object v2, p0, Lkik/android/widget/preferences/h;->b:Lkik/android/widget/preferences/KikCheckBoxPreference;

    invoke-static {v2}, Lkik/android/widget/preferences/KikCheckBoxPreference;->a(Lkik/android/widget/preferences/KikCheckBoxPreference;)Lcom/kik/d/b/a$c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/d/b/a$c;->a()I

    move-result v2

    int-to-long v6, v2

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v5, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    iget-object v1, p0, Lkik/android/widget/preferences/h;->b:Lkik/android/widget/preferences/KikCheckBoxPreference;

    iget-object v1, v1, Lkik/android/widget/preferences/KikCheckBoxPreference;->a:Lkik/a/e/e;

    invoke-interface {v1}, Lkik/a/e/e;->c()Lcom/kik/d/f;

    move-result-object v1

    sget-object v2, Lcom/kik/d/b/a$k;->M:Lcom/kik/d/b/a$k;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v6

    move-object v4, v3

    invoke-virtual/range {v1 .. v7}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;J)V

    goto :goto_0
.end method
