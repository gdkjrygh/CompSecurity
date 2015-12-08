.class final Lcom/kik/android/a$g;
.super Lcom/kik/android/a$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/android/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "g"
.end annotation


# instance fields
.field final synthetic a:Lcom/kik/android/a;


# direct methods
.method protected constructor <init>(Lcom/kik/android/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1014
    iput-object p1, p0, Lcom/kik/android/a$g;->a:Lcom/kik/android/a;

    .line 1015
    invoke-direct {p0, p1, p2, p3}, Lcom/kik/android/a$f;-><init>(Lcom/kik/android/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 1016
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    .prologue
    .line 1020
    invoke-static {}, Lcom/kik/android/a;->e()Lorg/c/b;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Event "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/kik/android/a$g;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1022
    iget-object v0, p0, Lcom/kik/android/a$g;->a:Lcom/kik/android/a;

    invoke-static {v0}, Lcom/kik/android/a;->a(Lcom/kik/android/a;)Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/kik/android/a$g;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/kik/android/a$g;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1024
    iget-object v0, p0, Lcom/kik/android/a$g;->a:Lcom/kik/android/a;

    invoke-static {v0}, Lcom/kik/android/a;->b(Lcom/kik/android/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1025
    iget-object v0, p0, Lcom/kik/android/a$g;->a:Lcom/kik/android/a;

    invoke-static {v0}, Lcom/kik/android/a;->c(Lcom/kik/android/a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1032
    :goto_0
    iget-boolean v0, p0, Lcom/kik/android/a$g;->c:Z

    if-eqz v0, :cond_0

    .line 1033
    iget-object v0, p0, Lcom/kik/android/a$g;->a:Lcom/kik/android/a;

    invoke-static {v0}, Lcom/kik/android/a;->f(Lcom/kik/android/a;)Lcom/kik/c/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/android/a$g;->a:Lcom/kik/android/a;

    invoke-static {v1}, Lcom/kik/android/a;->e(Lcom/kik/android/a;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/kik/c/b;->a(Lcom/kik/android/a$f;Lorg/json/JSONObject;)V

    .line 1035
    :cond_0
    return-void

    .line 1028
    :cond_1
    iget-object v0, p0, Lcom/kik/android/a$g;->a:Lcom/kik/android/a;

    invoke-static {v0}, Lcom/kik/android/a;->d(Lcom/kik/android/a;)Lcom/mixpanel/android/mpmetrics/v;

    move-result-object v0

    invoke-virtual {p0}, Lcom/kik/android/a$g;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/kik/android/a$g;->f()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mixpanel/android/mpmetrics/v;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 1029
    iget-object v0, p0, Lcom/kik/android/a$g;->a:Lcom/kik/android/a;

    invoke-static {v0}, Lcom/kik/android/a;->d(Lcom/kik/android/a;)Lcom/mixpanel/android/mpmetrics/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/v;->a()V

    goto :goto_0
.end method
