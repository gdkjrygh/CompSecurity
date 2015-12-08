.class final Lcom/mixpanel/android/mpmetrics/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lorg/json/JSONObject;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 161
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/a$a;->a:Ljava/lang/String;

    .line 162
    iput-object p2, p0, Lcom/mixpanel/android/mpmetrics/a$a;->b:Lorg/json/JSONObject;

    .line 163
    iput-object p3, p0, Lcom/mixpanel/android/mpmetrics/a$a;->c:Ljava/lang/String;

    .line 164
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 167
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 171
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$a;->b:Lorg/json/JSONObject;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 175
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$a;->c:Ljava/lang/String;

    return-object v0
.end method
