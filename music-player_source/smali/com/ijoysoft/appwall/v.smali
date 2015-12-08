.class public final Lcom/ijoysoft/appwall/v;
.super Landroid/os/AsyncTask;


# instance fields
.field private a:Lcom/ijoysoft/appwall/w;


# direct methods
.method public constructor <init>(Lcom/ijoysoft/appwall/w;)V
    .locals 0

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p1, p0, Lcom/ijoysoft/appwall/v;->a:Lcom/ijoysoft/appwall/w;

    return-void
.end method

.method private static varargs a([Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 7

    const/4 v1, 0x0

    const/4 v0, 0x0

    :try_start_0
    aget-object v0, p0, v0

    invoke-static {v0}, Lcom/ijoysoft/appwall/u;->a(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    new-instance v0, Lcom/ijoysoft/appwall/s;

    invoke-direct {v0}, Lcom/ijoysoft/appwall/s;-><init>()V

    if-eqz v2, :cond_0

    invoke-static {}, Ljavax/xml/parsers/SAXParserFactory;->newInstance()Ljavax/xml/parsers/SAXParserFactory;

    move-result-object v3

    invoke-virtual {v3}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;

    move-result-object v3

    new-instance v4, Lcom/ijoysoft/appwall/t;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v5}, Lcom/ijoysoft/appwall/t;-><init>(Lcom/ijoysoft/appwall/s;B)V

    invoke-virtual {v3, v2, v4}, Ljavax/xml/parsers/SAXParser;->parse(Ljava/io/InputStream;Lorg/xml/sax/helpers/DefaultHandler;)V

    iget-object v0, v4, Lcom/ijoysoft/appwall/t;->a:Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    :goto_1
    return-object v0

    :cond_0
    move-object v0, v1

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v6, v0

    move-object v0, v1

    move-object v1, v6

    :goto_2
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v6, v0

    move-object v0, v1

    move-object v1, v6

    :goto_3
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    :catch_2
    move-exception v1

    goto :goto_3

    :catch_3
    move-exception v1

    goto :goto_2
.end method


# virtual methods
.method protected final varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, [Ljava/lang/String;

    invoke-static {p1}, Lcom/ijoysoft/appwall/v;->a([Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/ijoysoft/appwall/v;->a:Lcom/ijoysoft/appwall/w;

    invoke-interface {v0, p1}, Lcom/ijoysoft/appwall/w;->a(Ljava/util/ArrayList;)V

    return-void
.end method
