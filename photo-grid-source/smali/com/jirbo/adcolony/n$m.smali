.class Lcom/jirbo/adcolony/n$m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field f:Ljava/lang/String;

.field g:Ljava/lang/String;

.field h:Lcom/jirbo/adcolony/n$l;

.field i:Lcom/jirbo/adcolony/n$g;

.field j:Lcom/jirbo/adcolony/n$g;

.field k:Lcom/jirbo/adcolony/n$g;

.field l:Lcom/jirbo/adcolony/n$g;

.field m:Lcom/jirbo/adcolony/n$g;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1202
    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->c:Lcom/jirbo/adcolony/o;

    iget-object v2, p0, Lcom/jirbo/adcolony/n$m;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/o;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1213
    :cond_0
    :goto_0
    return v0

    .line 1203
    :cond_1
    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->c:Lcom/jirbo/adcolony/o;

    iget-object v2, p0, Lcom/jirbo/adcolony/n$m;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/o;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1204
    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->c:Lcom/jirbo/adcolony/o;

    iget-object v2, p0, Lcom/jirbo/adcolony/n$m;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/o;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1206
    iget-object v1, p0, Lcom/jirbo/adcolony/n$m;->h:Lcom/jirbo/adcolony/n$l;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$l;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1207
    iget-object v1, p0, Lcom/jirbo/adcolony/n$m;->i:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$g;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1208
    iget-object v1, p0, Lcom/jirbo/adcolony/n$m;->j:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$g;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1209
    iget-object v1, p0, Lcom/jirbo/adcolony/n$m;->k:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$g;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1210
    iget-object v1, p0, Lcom/jirbo/adcolony/n$m;->l:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$g;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1211
    iget-object v1, p0, Lcom/jirbo/adcolony/n$m;->m:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$g;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1213
    const/4 v0, 0x1

    goto :goto_0
.end method

.method a(Lcom/jirbo/adcolony/ADCData$g;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1218
    if-nez p1, :cond_1

    .line 1246
    :cond_0
    :goto_0
    return v0

    .line 1220
    :cond_1
    const-string v1, "tiny_glow_image"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jirbo/adcolony/n$m;->a:Ljava/lang/String;

    .line 1221
    const-string v1, "tiny_glow_image_last_modified;"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jirbo/adcolony/n$m;->b:Ljava/lang/String;

    .line 1222
    const-string v1, "background_bar_image"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jirbo/adcolony/n$m;->c:Ljava/lang/String;

    .line 1223
    const-string v1, "background_bar_image_last_modified"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jirbo/adcolony/n$m;->d:Ljava/lang/String;

    .line 1224
    const-string v1, "background_tile_image"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jirbo/adcolony/n$m;->e:Ljava/lang/String;

    .line 1225
    const-string v1, "background_tile_image_last_modified"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jirbo/adcolony/n$m;->f:Ljava/lang/String;

    .line 1226
    const-string v1, "background_color"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jirbo/adcolony/n$m;->g:Ljava/lang/String;

    .line 1229
    new-instance v1, Lcom/jirbo/adcolony/n$l;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$l;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$m;->h:Lcom/jirbo/adcolony/n$l;

    .line 1230
    iget-object v1, p0, Lcom/jirbo/adcolony/n$m;->h:Lcom/jirbo/adcolony/n$l;

    const-string v2, "logo"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$l;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1233
    new-instance v1, Lcom/jirbo/adcolony/n$l;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$l;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$m;->h:Lcom/jirbo/adcolony/n$l;

    .line 1234
    iget-object v1, p0, Lcom/jirbo/adcolony/n$m;->h:Lcom/jirbo/adcolony/n$l;

    const-string v2, "logo"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$l;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1235
    new-instance v1, Lcom/jirbo/adcolony/n$g;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$g;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$m;->i:Lcom/jirbo/adcolony/n$g;

    .line 1236
    iget-object v1, p0, Lcom/jirbo/adcolony/n$m;->i:Lcom/jirbo/adcolony/n$g;

    const-string v2, "stop"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$g;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1237
    new-instance v1, Lcom/jirbo/adcolony/n$g;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$g;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$m;->j:Lcom/jirbo/adcolony/n$g;

    .line 1238
    iget-object v1, p0, Lcom/jirbo/adcolony/n$m;->j:Lcom/jirbo/adcolony/n$g;

    const-string v2, "back"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$g;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1239
    new-instance v1, Lcom/jirbo/adcolony/n$g;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$g;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$m;->k:Lcom/jirbo/adcolony/n$g;

    .line 1240
    iget-object v1, p0, Lcom/jirbo/adcolony/n$m;->k:Lcom/jirbo/adcolony/n$g;

    const-string v2, "close"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$g;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1241
    new-instance v1, Lcom/jirbo/adcolony/n$g;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$g;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$m;->l:Lcom/jirbo/adcolony/n$g;

    .line 1242
    iget-object v1, p0, Lcom/jirbo/adcolony/n$m;->l:Lcom/jirbo/adcolony/n$g;

    const-string v2, "forward"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$g;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1243
    new-instance v1, Lcom/jirbo/adcolony/n$g;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$g;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$m;->m:Lcom/jirbo/adcolony/n$g;

    .line 1244
    iget-object v1, p0, Lcom/jirbo/adcolony/n$m;->m:Lcom/jirbo/adcolony/n$g;

    const-string v2, "reload"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$g;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1246
    const/4 v0, 0x1

    goto/16 :goto_0
.end method

.method b()V
    .locals 3

    .prologue
    .line 1251
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->c:Lcom/jirbo/adcolony/o;

    iget-object v1, p0, Lcom/jirbo/adcolony/n$m;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/jirbo/adcolony/n$m;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1252
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->c:Lcom/jirbo/adcolony/o;

    iget-object v1, p0, Lcom/jirbo/adcolony/n$m;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/jirbo/adcolony/n$m;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1253
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->c:Lcom/jirbo/adcolony/o;

    iget-object v1, p0, Lcom/jirbo/adcolony/n$m;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/jirbo/adcolony/n$m;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1255
    iget-object v0, p0, Lcom/jirbo/adcolony/n$m;->h:Lcom/jirbo/adcolony/n$l;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$l;->b()V

    .line 1256
    iget-object v0, p0, Lcom/jirbo/adcolony/n$m;->i:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$g;->b()V

    .line 1257
    iget-object v0, p0, Lcom/jirbo/adcolony/n$m;->j:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$g;->b()V

    .line 1258
    iget-object v0, p0, Lcom/jirbo/adcolony/n$m;->k:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$g;->b()V

    .line 1259
    iget-object v0, p0, Lcom/jirbo/adcolony/n$m;->l:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$g;->b()V

    .line 1260
    iget-object v0, p0, Lcom/jirbo/adcolony/n$m;->m:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$g;->b()V

    .line 1261
    return-void
.end method
