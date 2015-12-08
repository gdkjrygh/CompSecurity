.class final Lcom/mixpanel/android/mpmetrics/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/mixpanel/android/mpmetrics/k;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/mpmetrics/k;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/l;->a:Lcom/mixpanel/android/mpmetrics/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/l;->a:Lcom/mixpanel/android/mpmetrics/k;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/k;->a(Lcom/mixpanel/android/mpmetrics/k;)V

    .line 61
    return-void
.end method
