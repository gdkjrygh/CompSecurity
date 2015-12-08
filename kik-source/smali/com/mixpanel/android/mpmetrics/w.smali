.class final Lcom/mixpanel/android/mpmetrics/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mixpanel/android/mpmetrics/af$b;


# instance fields
.field final synthetic a:Lcom/mixpanel/android/mpmetrics/v;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/mpmetrics/v;)V
    .locals 0

    .prologue
    .line 968
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/w;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/SharedPreferences;)V
    .locals 2

    .prologue
    .line 971
    invoke-static {p1}, Lcom/mixpanel/android/mpmetrics/ac;->a(Landroid/content/SharedPreferences;)Lorg/json/JSONArray;

    move-result-object v0

    .line 972
    if-eqz v0, :cond_0

    .line 973
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/w;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-static {v1, v0}, Lcom/mixpanel/android/mpmetrics/v;->a(Lcom/mixpanel/android/mpmetrics/v;Lorg/json/JSONArray;)V

    .line 975
    :cond_0
    return-void
.end method
