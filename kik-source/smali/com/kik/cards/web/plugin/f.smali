.class public final Lcom/kik/cards/web/plugin/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 19
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/kik/cards/web/plugin/f;-><init>(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 20
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/kik/cards/web/plugin/f;->a:Ljava/lang/String;

    .line 14
    iput-object p2, p0, Lcom/kik/cards/web/plugin/f;->b:Lorg/json/JSONObject;

    .line 15
    return-void
.end method


# virtual methods
.method public final a()Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/kik/cards/web/plugin/f;->b:Lorg/json/JSONObject;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/kik/cards/web/plugin/f;->a:Ljava/lang/String;

    return-object v0
.end method
