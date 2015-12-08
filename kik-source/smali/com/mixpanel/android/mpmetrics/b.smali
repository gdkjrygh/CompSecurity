.class final Lcom/mixpanel/android/mpmetrics/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mixpanel/android/mpmetrics/v$a;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/mixpanel/android/mpmetrics/a$b$a;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/mpmetrics/a$b$a;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 363
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/b;->b:Lcom/mixpanel/android/mpmetrics/a$b$a;

    iput-object p2, p0, Lcom/mixpanel/android/mpmetrics/b;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/mixpanel/android/mpmetrics/v;)V
    .locals 2

    .prologue
    .line 366
    sget-boolean v0, Lcom/mixpanel/android/mpmetrics/t;->a:Z

    if-eqz v0, :cond_0

    .line 367
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Using existing pushId "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    :cond_0
    invoke-virtual {p1}, Lcom/mixpanel/android/mpmetrics/v;->c()Lcom/mixpanel/android/mpmetrics/v$b;

    move-result-object v0

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/b;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/mixpanel/android/mpmetrics/v$b;->a(Ljava/lang/String;)V

    .line 370
    return-void
.end method
