.class final Lcom/kik/c/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lorg/json/JSONObject;

.field final synthetic b:Lcom/kik/c/b;


# direct methods
.method constructor <init>(Lcom/kik/c/b;Lorg/json/JSONObject;)V
    .locals 0

    .prologue
    .line 175
    iput-object p1, p0, Lcom/kik/c/c;->b:Lcom/kik/c/b;

    iput-object p2, p0, Lcom/kik/c/c;->a:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 179
    iget-object v0, p0, Lcom/kik/c/c;->b:Lcom/kik/c/b;

    iget-object v1, p0, Lcom/kik/c/c;->a:Lorg/json/JSONObject;

    invoke-static {v0, v1}, Lcom/kik/c/b;->a(Lcom/kik/c/b;Lorg/json/JSONObject;)V

    .line 180
    return-void
.end method
