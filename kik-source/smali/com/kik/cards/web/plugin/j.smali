.class public final Lcom/kik/cards/web/plugin/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 26
    const/16 v0, 0xc8

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(ILorg/json/JSONObject;)V

    .line 27
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .prologue
    .line 43
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/kik/cards/web/plugin/j;-><init>(ILorg/json/JSONObject;)V

    .line 44
    return-void
.end method

.method public constructor <init>(ILorg/json/JSONObject;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput p1, p0, Lcom/kik/cards/web/plugin/j;->a:I

    .line 38
    iput-object p2, p0, Lcom/kik/cards/web/plugin/j;->b:Lorg/json/JSONObject;

    .line 39
    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 1

    .prologue
    .line 31
    const/16 v0, 0xc8

    invoke-direct {p0, v0, p1}, Lcom/kik/cards/web/plugin/j;-><init>(ILorg/json/JSONObject;)V

    .line 32
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 48
    iget v0, p0, Lcom/kik/cards/web/plugin/j;->a:I

    return v0
.end method

.method public final b()Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/kik/cards/web/plugin/j;->b:Lorg/json/JSONObject;

    return-object v0
.end method
