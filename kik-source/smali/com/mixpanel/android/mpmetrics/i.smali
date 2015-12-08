.class final Lcom/mixpanel/android/mpmetrics/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mixpanel/android/mpmetrics/v$a;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/mixpanel/android/mpmetrics/GCMReceiver;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/mpmetrics/GCMReceiver;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 107
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/i;->b:Lcom/mixpanel/android/mpmetrics/GCMReceiver;

    iput-object p2, p0, Lcom/mixpanel/android/mpmetrics/i;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/mixpanel/android/mpmetrics/v;)V
    .locals 2

    .prologue
    .line 110
    invoke-virtual {p1}, Lcom/mixpanel/android/mpmetrics/v;->c()Lcom/mixpanel/android/mpmetrics/v$b;

    move-result-object v0

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/i;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/mixpanel/android/mpmetrics/v$b;->a(Ljava/lang/String;)V

    .line 111
    return-void
.end method
