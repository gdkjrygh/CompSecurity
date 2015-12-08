.class final Lcom/mixpanel/android/mpmetrics/af$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/af;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/mixpanel/android/mpmetrics/af$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/af$b;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/af$a;->a:Landroid/content/Context;

    .line 32
    iput-object p2, p0, Lcom/mixpanel/android/mpmetrics/af$a;->b:Ljava/lang/String;

    .line 33
    iput-object p3, p0, Lcom/mixpanel/android/mpmetrics/af$a;->c:Lcom/mixpanel/android/mpmetrics/af$b;

    .line 34
    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 3

    .prologue
    .line 29
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/af$a;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/af$a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/af$a;->c:Lcom/mixpanel/android/mpmetrics/af$b;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/af$a;->c:Lcom/mixpanel/android/mpmetrics/af$b;

    invoke-interface {v1, v0}, Lcom/mixpanel/android/mpmetrics/af$b;->a(Landroid/content/SharedPreferences;)V

    :cond_0
    return-object v0
.end method
