.class final Lkik/android/widget/preferences/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceClickListener;


# instance fields
.field final synthetic a:Landroid/preference/Preference$OnPreferenceClickListener;

.field final synthetic b:Lkik/android/widget/preferences/KikPreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/KikPreference;Landroid/preference/Preference$OnPreferenceClickListener;)V
    .locals 0

    .prologue
    .line 210
    iput-object p1, p0, Lkik/android/widget/preferences/aa;->b:Lkik/android/widget/preferences/KikPreference;

    iput-object p2, p0, Lkik/android/widget/preferences/aa;->a:Landroid/preference/Preference$OnPreferenceClickListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 215
    iget-object v0, p0, Lkik/android/widget/preferences/aa;->b:Lkik/android/widget/preferences/KikPreference;

    invoke-virtual {v0, p1}, Lkik/android/widget/preferences/KikPreference;->onPreferenceClick(Landroid/preference/Preference;)Z

    move-result v0

    .line 217
    iget-object v1, p0, Lkik/android/widget/preferences/aa;->a:Landroid/preference/Preference$OnPreferenceClickListener;

    invoke-interface {v1, p1}, Landroid/preference/Preference$OnPreferenceClickListener;->onPreferenceClick(Landroid/preference/Preference;)Z

    move-result v1

    or-int/2addr v0, v1

    .line 219
    iget-object v1, p0, Lkik/android/widget/preferences/aa;->b:Lkik/android/widget/preferences/KikPreference;

    invoke-static {v1}, Lkik/android/widget/preferences/KikPreference;->a(Lkik/android/widget/preferences/KikPreference;)Lcom/kik/d/b/a$c;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 220
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 222
    const-string v1, "s"

    iget-object v2, p0, Lkik/android/widget/preferences/aa;->b:Lkik/android/widget/preferences/KikPreference;

    invoke-static {v2}, Lkik/android/widget/preferences/KikPreference;->a(Lkik/android/widget/preferences/KikPreference;)Lcom/kik/d/b/a$c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/d/b/a$c;->a()I

    move-result v2

    int-to-long v6, v2

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v5, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    iget-object v1, p0, Lkik/android/widget/preferences/aa;->b:Lkik/android/widget/preferences/KikPreference;

    iget-object v1, v1, Lkik/android/widget/preferences/KikPreference;->a:Lkik/a/e/e;

    invoke-interface {v1}, Lkik/a/e/e;->c()Lcom/kik/d/f;

    move-result-object v1

    sget-object v2, Lcom/kik/d/b/a$k;->M:Lcom/kik/d/b/a$k;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v6

    move-object v4, v3

    invoke-virtual/range {v1 .. v7}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;J)V

    .line 227
    :cond_0
    return v0
.end method
