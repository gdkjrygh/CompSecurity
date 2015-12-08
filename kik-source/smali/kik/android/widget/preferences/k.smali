.class final Lkik/android/widget/preferences/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceChangeListener;


# instance fields
.field final synthetic a:Landroid/preference/Preference$OnPreferenceChangeListener;

.field final synthetic b:Lkik/android/widget/preferences/KikEditTextPreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/KikEditTextPreference;Landroid/preference/Preference$OnPreferenceChangeListener;)V
    .locals 0

    .prologue
    .line 118
    iput-object p1, p0, Lkik/android/widget/preferences/k;->b:Lkik/android/widget/preferences/KikEditTextPreference;

    iput-object p2, p0, Lkik/android/widget/preferences/k;->a:Landroid/preference/Preference$OnPreferenceChangeListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 122
    iget-object v0, p0, Lkik/android/widget/preferences/k;->b:Lkik/android/widget/preferences/KikEditTextPreference;

    invoke-virtual {v0, p1, p2}, Lkik/android/widget/preferences/KikEditTextPreference;->onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z

    move-result v0

    .line 124
    iget-object v1, p0, Lkik/android/widget/preferences/k;->a:Landroid/preference/Preference$OnPreferenceChangeListener;

    invoke-interface {v1, p1, p2}, Landroid/preference/Preference$OnPreferenceChangeListener;->onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    .line 126
    if-eqz v0, :cond_0

    .line 127
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 129
    const-string v1, "s"

    iget-object v2, p0, Lkik/android/widget/preferences/k;->b:Lkik/android/widget/preferences/KikEditTextPreference;

    invoke-static {v2}, Lkik/android/widget/preferences/KikEditTextPreference;->a(Lkik/android/widget/preferences/KikEditTextPreference;)Lcom/kik/d/b/a$c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/d/b/a$c;->a()I

    move-result v2

    int-to-long v6, v2

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v5, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    iget-object v1, p0, Lkik/android/widget/preferences/k;->b:Lkik/android/widget/preferences/KikEditTextPreference;

    iget-object v1, v1, Lkik/android/widget/preferences/KikEditTextPreference;->a:Lkik/a/e/e;

    invoke-interface {v1}, Lkik/a/e/e;->c()Lcom/kik/d/f;

    move-result-object v1

    sget-object v2, Lcom/kik/d/b/a$k;->M:Lcom/kik/d/b/a$k;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v6

    move-object v4, v3

    invoke-virtual/range {v1 .. v7}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;J)V

    .line 134
    :cond_0
    return v0
.end method
