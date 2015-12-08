.class final Lcom/mixpanel/android/mpmetrics/y;
.super Lcom/mixpanel/android/mpmetrics/v$c;
.source "SourceFile"


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/mixpanel/android/mpmetrics/v$c;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/mpmetrics/v$c;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1314
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/y;->c:Lcom/mixpanel/android/mpmetrics/v$c;

    iput-object p2, p0, Lcom/mixpanel/android/mpmetrics/y;->b:Ljava/lang/String;

    iget-object v0, p1, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/mixpanel/android/mpmetrics/v$c;-><init>(Lcom/mixpanel/android/mpmetrics/v;B)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1317
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/y;->b:Ljava/lang/String;

    return-object v0
.end method
