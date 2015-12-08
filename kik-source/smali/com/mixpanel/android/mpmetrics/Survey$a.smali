.class public final Lcom/mixpanel/android/mpmetrics/Survey$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/Survey;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/mixpanel/android/mpmetrics/Survey;

.field private final b:I

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/util/List;


# direct methods
.method private constructor <init>(Lcom/mixpanel/android/mpmetrics/Survey;Lorg/json/JSONObject;)V
    .locals 4

    .prologue
    .line 113
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/Survey$a;->a:Lcom/mixpanel/android/mpmetrics/Survey;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    const-string v0, "id"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/mixpanel/android/mpmetrics/Survey$a;->b:I

    .line 115
    const-string v0, "type"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/Survey$a;->c:Ljava/lang/String;

    .line 116
    const-string v0, "prompt"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/Survey$a;->d:Ljava/lang/String;

    .line 118
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 119
    const-string v1, "extra_data"

    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 120
    const-string v1, "extra_data"

    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 121
    const-string v2, "$choices"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 122
    const-string v0, "$choices"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 123
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 124
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v0, v3, :cond_0

    .line 125
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 129
    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/Survey$a;->e:Ljava/util/List;

    .line 130
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/Survey$a;->d()Lcom/mixpanel/android/mpmetrics/Survey$b;

    move-result-object v0

    sget-object v1, Lcom/mixpanel/android/mpmetrics/Survey$b;->b:Lcom/mixpanel/android/mpmetrics/Survey$b;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/Survey$a;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 131
    new-instance v0, Lcom/mixpanel/android/mpmetrics/e;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Question is multiple choice but has no answers:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/mixpanel/android/mpmetrics/e;-><init>(Ljava/lang/String;)V

    throw v0

    .line 133
    :cond_2
    return-void
.end method

.method synthetic constructor <init>(Lcom/mixpanel/android/mpmetrics/Survey;Lorg/json/JSONObject;B)V
    .locals 0

    .prologue
    .line 112
    invoke-direct {p0, p1, p2}, Lcom/mixpanel/android/mpmetrics/Survey$a;-><init>(Lcom/mixpanel/android/mpmetrics/Survey;Lorg/json/JSONObject;)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 136
    iget v0, p0, Lcom/mixpanel/android/mpmetrics/Survey$a;->b:I

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 140
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/Survey$a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/Survey$a;->e:Ljava/util/List;

    return-object v0
.end method

.method public final d()Lcom/mixpanel/android/mpmetrics/Survey$b;
    .locals 2

    .prologue
    .line 148
    sget-object v0, Lcom/mixpanel/android/mpmetrics/Survey$b;->b:Lcom/mixpanel/android/mpmetrics/Survey$b;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/Survey$b;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/Survey$a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 149
    sget-object v0, Lcom/mixpanel/android/mpmetrics/Survey$b;->b:Lcom/mixpanel/android/mpmetrics/Survey$b;

    .line 154
    :goto_0
    return-object v0

    .line 151
    :cond_0
    sget-object v0, Lcom/mixpanel/android/mpmetrics/Survey$b;->c:Lcom/mixpanel/android/mpmetrics/Survey$b;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/Survey$b;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/Survey$a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 152
    sget-object v0, Lcom/mixpanel/android/mpmetrics/Survey$b;->c:Lcom/mixpanel/android/mpmetrics/Survey$b;

    goto :goto_0

    .line 154
    :cond_1
    sget-object v0, Lcom/mixpanel/android/mpmetrics/Survey$b;->a:Lcom/mixpanel/android/mpmetrics/Survey$b;

    goto :goto_0
.end method
